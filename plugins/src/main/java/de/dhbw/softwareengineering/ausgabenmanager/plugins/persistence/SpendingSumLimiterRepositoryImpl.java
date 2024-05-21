package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.SpendingSumLimiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class SpendingSumLimiterRepositoryImpl implements SpendingSumLimiterRepository {

    @Autowired
    SpringSpendingSumLimiterRepository spendingSumLimiterRepository;

    @Override
    public SpendingSumLimiterEntity save(SpendingSumLimiterEntity e) {
        return spendingSumLimiterRepository.save(e);
    }

    @Override
    public void deleteById(Long id) {
        spendingSumLimiterRepository.deleteById(id);
    }

    @Override
    public Optional<SpendingSumLimiterEntity> getById(Long id) {
        // TODO Auto-generated method stub
        return spendingSumLimiterRepository.findById(id);
    }

    @Override
    public List<SpendingSumLimiterEntity> all() {
        // TODO Auto-generated method stub
        return spendingSumLimiterRepository.findAll();

    }

    @Override
    public void deleteAll() {
        spendingSumLimiterRepository.deleteAll();
    }
}
