package de.dhbw.softwareengineering.ausgabenmanager.application.services1;


import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.MarketRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MarketService {

        @Autowired
        private MarketRepository marketRepository;

        public void deleteById(Long id) {
            Objects.requireNonNull(id);
            marketRepository.deleteById(id);
        }

        public MarketEntity getById(Long id) {
            Objects.requireNonNull(id);
            Optional<MarketEntity> optionalEntity = marketRepository.getById(id);
            if(optionalEntity.isEmpty()) {
                throw new EntityNotFoundException("No market with id " + id);
            }
            return optionalEntity.get();

        }

        public MarketEntity createMarket(MarketEntity ee) {
            return marketRepository.save(ee);
        }

        public List<MarketEntity> findAll() {
            return marketRepository.all();
        }
}
