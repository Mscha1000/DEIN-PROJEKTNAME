package de.dhbw.softwareengineering.deinProjektname.application.services1;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;


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
        return purchaseRepository.save(ee);
    }

    public List<PurchaseEntity> findAll() {
        return purchaseRepository.all();
    }

}
