package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.MarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringMarketRepository extends JpaRepository<MarketEntity, Long> {
}
