package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringSpendingSumLimiterRepository extends JpaRepository<SpendingSumLimiterEntity, Long> {
}
