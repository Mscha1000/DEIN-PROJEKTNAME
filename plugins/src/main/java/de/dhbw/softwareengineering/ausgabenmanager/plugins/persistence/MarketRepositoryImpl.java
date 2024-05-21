package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.MarketRepository;
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
        return springMarketRepository.save(e);
    }


    @Override
    public void deleteById(Long id) {
        springMarketRepository.deleteById(id);
    }

    @Override
    public Optional<MarketEntity> getById(Long id) {
        // TODO Auto-generated method stub
        return springMarketRepository.findById(id);
    }

    @Override
    public List<MarketEntity> all() {

        // TODO Auto-generated method stub
        return springMarketRepository.findAll();

    }


}
