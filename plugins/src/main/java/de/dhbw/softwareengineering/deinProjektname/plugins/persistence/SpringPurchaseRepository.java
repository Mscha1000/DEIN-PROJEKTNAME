package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringPurchaseRepository extends JpaRepository<PurchaseEntity, Long> {
}
