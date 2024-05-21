package de.dhbw.softwareengineering.ausgabenmanager.plugins.rest;


import de.dhbw.softwareengineering.ausgabenmanager.application.services1.LocationService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location/id/{id}")
    public LocationEntity findById(@PathVariable Long id) {
        return locationService.getById(id);
    }

    @GetMapping("/location/{name}")
    public String name(@PathVariable String name) {
        return "location: " + name;
    }

    @GetMapping("/location/all")
    public List<LocationEntity> getAllLocations() {
        return locationService.findAll();
    }

    @PostMapping("/location")
    public LocationEntity creatLocation(@RequestBody LocationEntity body) {
        return locationService.createLocation(body);
    }


}
