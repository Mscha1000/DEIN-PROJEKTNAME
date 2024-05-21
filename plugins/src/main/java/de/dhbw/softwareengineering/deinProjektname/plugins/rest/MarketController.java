package de.dhbw.softwareengineering.deinProjektname.plugins.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {
    @GetMapping("/market/{id}")
    public String id(@PathVariable String id) {
        return "market: " + id;
    }

    @GetMapping("/market/{name}")
    public String name(@PathVariable String name) {
        return "market: " + name;
    }
}
