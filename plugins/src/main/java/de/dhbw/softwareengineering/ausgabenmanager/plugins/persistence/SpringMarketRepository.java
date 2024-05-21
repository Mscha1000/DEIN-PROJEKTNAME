package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringMarketRepository extends JpaRepository<MarketEntity, Long> {
}
