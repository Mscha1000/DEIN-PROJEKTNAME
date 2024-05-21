package de.dhbw.softwareengineering.ausgabenmanager.domain.repositories;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;

import java.util.List;
import java.util.Optional;

public interface SpendingSumLimiterRepository {

    SpendingSumLimiterEntity save(SpendingSumLimiterEntity e);

    void deleteById(Long id);

    void deleteAll();

    Optional<SpendingSumLimiterEntity> getById(Long id);

    List<SpendingSumLimiterEntity> all();
}
