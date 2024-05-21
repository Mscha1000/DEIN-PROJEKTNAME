package de.dhbw.softwareengineering.deinProjektname.domain.repositories;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;

import java.util.List;
import java.util.Optional;

public interface MethodRepository {

    MethodEntity save(MethodEntity e);

    void deleteById(String name);

    Optional<MethodEntity> getByName(String name);

    List<MethodEntity> all();
}
