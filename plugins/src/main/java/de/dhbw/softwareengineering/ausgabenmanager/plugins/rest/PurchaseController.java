package de.dhbw.softwareengineering.ausgabenmanager.plugins.rest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.PurchaseService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.PurchaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;


    @GetMapping("/purchase/id/{id}")
    public PurchaseEntity findById(@PathVariable Long id) {
        return purchaseService.getById(id);
    }

    @GetMapping("/purchase/all")
    public List<PurchaseEntity> getAllPurchases() {
        return purchaseService.findAll();
    }

    @PostMapping("/purchase/create")
    public PurchaseEntity createPurchase(@RequestBody PurchaseEntity body) {
        return purchaseService.createPurchase(body);
    }

    @DeleteMapping("/purchase/delete/{id}")
    public PurchaseEntity deleteById(@PathVariable Long id) {
        return null;
    }

}
