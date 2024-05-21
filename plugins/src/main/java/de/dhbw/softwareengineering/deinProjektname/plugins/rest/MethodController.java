package de.dhbw.softwareengineering.deinProjektname.plugins.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {

    @GetMapping("/method/{name}")
    public String name(@PathVariable String name) {
        return "method: " + name;
    }

}