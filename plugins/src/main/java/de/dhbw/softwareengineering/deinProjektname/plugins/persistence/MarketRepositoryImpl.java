package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.MarketEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MarketRepositoryImpl implements MarketRepository {

    @Autowired
    SpringMarketRepository springMarketRepository;

    @Override
    public MarketEntity save(MarketEntity e) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<MarketEntity> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<MarketEntity> all() {
        return null;
    }
}
