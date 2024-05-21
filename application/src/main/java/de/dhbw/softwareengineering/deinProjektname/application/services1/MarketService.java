package de.dhbw.softwareengineering.deinProjektname.application.services1;


import de.dhbw.softwareengineering.deinProjektname.domain.repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketService {

    @Autowired
    private MarketRepository repository;

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
