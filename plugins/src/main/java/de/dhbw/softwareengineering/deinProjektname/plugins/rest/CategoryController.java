package de.dhbw.softwareengineering.deinProjektname.plugins.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/category/{name}")
    public String name(@PathVariable String name) {
        return "category: " + name;
    }

}
