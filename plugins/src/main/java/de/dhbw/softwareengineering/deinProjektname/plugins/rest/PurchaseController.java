package de.dhbw.softwareengineering.deinProjektname.plugins.rest;

import de.dhbw.softwareengineering.deinProjektname.application.services1.PurchaseService;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService service;

    @GetMapping("/purchase/{id}")
    public String id(@PathVariable String id) {
        return "purchase: " + id;
    }

    @GetMapping("/purchase/{name}")
    public String name(@PathVariable String name) {
        return "purchase: " + name;
    }

    @PostMapping("/purchase")
    public PurchaseEntity createPurchase(@RequestBody PurchaseEntity body) {
        return service.createPurchase(body);
    }

}
