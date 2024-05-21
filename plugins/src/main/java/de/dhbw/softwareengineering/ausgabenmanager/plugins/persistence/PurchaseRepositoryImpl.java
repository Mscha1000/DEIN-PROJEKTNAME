package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.PurchaseEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaseRepositoryImpl implements PurchaseRepository {

    @Autowired
    SpringPurchaseRepository springPurchaseRepository;

    @Override
    public PurchaseEntity save(PurchaseEntity e) {
        return springPurchaseRepository.save(e);
    }

    @Override
    public void deleteById(Long id) {
        springPurchaseRepository.deleteById(id);
    }

    @Override
    public Optional<PurchaseEntity> getById(Long id) {
        // TODO Auto-generated method stub
        return springPurchaseRepository.findById(id);
    }

    @Override
    public List<PurchaseEntity> all() {
        // TODO Auto-generated method stub
        return springPurchaseRepository.findAll();
    }


}
