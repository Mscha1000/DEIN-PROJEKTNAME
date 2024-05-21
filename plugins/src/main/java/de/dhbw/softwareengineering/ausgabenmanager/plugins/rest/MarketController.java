package de.dhbw.softwareengineering.ausgabenmanager.plugins.rest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.MarketService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketController {

    @Autowired
    private MarketService marketService;

    @GetMapping("/market/id/{id}")
    public MarketEntity findById(@PathVariable Long id) {
        return marketService.getById(id);
    }

    @GetMapping("/market/all")
    public List<MarketEntity> getAllMarkets() {
        return marketService.findAll();
    }

    @PostMapping("/market/create")
    public MarketEntity createMarket(@RequestBody MarketEntity body) {
        return marketService.createMarket(body);
    }

    @DeleteMapping("/market/delete/{id}")
    public MarketEntity deleteById(@PathVariable Long id) {
        return null;
    }


}
