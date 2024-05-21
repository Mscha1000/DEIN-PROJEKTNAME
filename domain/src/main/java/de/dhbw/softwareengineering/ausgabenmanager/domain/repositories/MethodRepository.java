package de.dhbw.softwareengineering.ausgabenmanager.domain.repositories;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;

import java.util.List;
import java.util.Optional;

public interface MethodRepository {

    MethodEntity save(MethodEntity e);

    void deleteById(String name);

    Optional<MethodEntity> getById(String name);

    List<MethodEntity> all();
}
