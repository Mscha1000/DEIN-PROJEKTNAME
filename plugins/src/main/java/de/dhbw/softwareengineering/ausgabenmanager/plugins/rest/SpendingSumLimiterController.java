package de.dhbw.softwareengineering.ausgabenmanager.plugins.rest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.SpendingSumLimiterService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpendingSumLimiterController {

    @Autowired
    private SpendingSumLimiterService spendingSumLimiterService;

    @GetMapping("/limiter/id/{id}")
    public SpendingSumLimiterEntity findById(@PathVariable Long id) {
        return spendingSumLimiterService.getById(id);
    }

    @GetMapping("/limiter/all")
    public List<SpendingSumLimiterEntity> getAllMarkets() {
        return spendingSumLimiterService.findAll();
    }

    @PostMapping("/limiter/create")
    public SpendingSumLimiterEntity createMarket(@RequestBody SpendingSumLimiterEntity body) {
        return spendingSumLimiterService.createSpendingSumLimiter(body);
    }

    @DeleteMapping("/limiter/delete/{id}")
    public SpendingSumLimiterEntity deleteById(@PathVariable Long id) {
        return null;
    }

}
