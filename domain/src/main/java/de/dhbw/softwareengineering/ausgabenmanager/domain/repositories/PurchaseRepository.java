package de.dhbw.softwareengineering.ausgabenmanager.domain.repositories;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.PurchaseEntity;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    PurchaseEntity save(PurchaseEntity e);

    void deleteById(Long id);

    Optional<PurchaseEntity> getById(Long id);

    List<PurchaseEntity> all();

}
