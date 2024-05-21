package de.dhbw.softwareengineering.ausgabenmanager.domain.repositories;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.LocationEntity;

import java.util.List;
import java.util.Optional;

public interface LocationRepository {
    LocationEntity save(LocationEntity e);

    void deleteById(Long id);

    Optional<LocationEntity> getById(Long id);

    List<LocationEntity> all();
}
