package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringPurchaseRepository extends JpaRepository<PurchaseEntity, Long> {
}
