package de.dhbw.softwareengineering.ausgabenmanager.application.services1;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.SpendingSumLimiterRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class SpendingSumLimiterService {

    @Autowired
    private SpendingSumLimiterRepository spendingSumLimiterRepository;

    public void deleteById(Long id) {
        Objects.requireNonNull(id);
        spendingSumLimiterRepository.deleteById(id);
    }

    public SpendingSumLimiterEntity getById(Long id) {
        Objects.requireNonNull(id);
        Optional<SpendingSumLimiterEntity> optionalEntity = spendingSumLimiterRepository.getById(id);
        if(optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("No Limiter with id " + id);
        }
        return optionalEntity.get();

    }

    public SpendingSumLimiterEntity createSpendingSumLimiter(SpendingSumLimiterEntity ee) {
        spendingSumLimiterRepository.deleteAll();
        return spendingSumLimiterRepository.save(ee);
    }

    public List<SpendingSumLimiterEntity> findAll() {
        return spendingSumLimiterRepository.all();
    }

    public void deleteAll() {
        spendingSumLimiterRepository.deleteAll();}
}
