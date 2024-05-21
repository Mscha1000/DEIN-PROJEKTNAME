package de.dhbw.softwareengineering.ausgabenmanager.application.services1;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.*;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;


import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class PurchaseService {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private MarketRepository marketRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    MethodRepository methodRepository;

    @Autowired
    SpendingSumLimiterRepository spendingSumLimiterRepository;


    public void deleteById(Long id) {
        Objects.requireNonNull(id);
        purchaseRepository.deleteById(id);
    }

    public PurchaseEntity getById(Long id) {
        Objects.requireNonNull(id);
        Optional<PurchaseEntity> optionalEntity = purchaseRepository.getById(id);
        if(optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("No purchase with id " + id);
        }
        return optionalEntity.get();

    }


    public PurchaseEntity createPurchase(PurchaseEntity ee) {
        //MarketID darf nicht auf 0 sein, sonst tritt Fehler auf.

        MarketEntity marketEntity = ee.getMarket();
        Optional<MarketEntity> existingMarket = marketRepository.getById(marketEntity.getId());

        if (existingMarket.isPresent()) {
            ee.setMarket(existingMarket.get());
        } else {
            marketRepository.save(marketEntity);
        }

        CategoryEntity categoryEntity = ee.getCategory();
        Optional<CategoryEntity> existingCategory = categoryRepository.getById(categoryEntity.getName());

        if (existingCategory.isPresent()) {
            ee.setCategory(existingCategory.get());
        } else {
            categoryRepository.save(categoryEntity);
        }

        MethodEntity methodEntity = ee.getMethod();
        Optional<MethodEntity> existingMethod = methodRepository.getById(methodEntity.getName());

        if (existingMethod.isPresent()) {
            ee.setMethod(existingMethod.get());
        } else {
            methodRepository.save(methodEntity);
        }

        try{
        List<SpendingSumLimiterEntity> existingLimiter = spendingSumLimiterRepository.all();
        double newLimiterValue = existingLimiter.get(0).getMaxSpendingSum() - ee.getCost();
        long idOfLimiter = existingLimiter.get(0).getId();
        spendingSumLimiterRepository.save(new SpendingSumLimiterEntity(idOfLimiter, newLimiterValue));
        if (newLimiterValue > 0) {
            System.out.println("Restbetrag über " + newLimiterValue + "noch vorhanden." );
        } else {
            System.out.println("Restbetrag über " + ANSI_RED + newLimiterValue + ANSI_RESET + " überschritten." );
        }
        }catch (Exception e){
            System.out.println("Kein Limiter gesetzt.");
        }

        MessageBuilder message = new MessageBuilder.Builder()
                .greeting("Hello,")
                .body("Your Purchase has been added.")
                .closing("Best regards")
                .build();

        System.out.println(message.buildMessage());

        return purchaseRepository.save(ee);
    }



    public List<PurchaseEntity> findAll() {
        return purchaseRepository.all();
    }

}
