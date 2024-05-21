package de.dhbw.softwareengineering.deinProjektname.domain.repositories;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.MarketEntity;

import java.util.List;
import java.util.Optional;

public interface MarketRepository {

    MarketEntity save(MarketEntity e);

    void deleteById(Long id);

    Optional<MarketEntity> getById(Long id);

    List<MarketEntity> all();
}
