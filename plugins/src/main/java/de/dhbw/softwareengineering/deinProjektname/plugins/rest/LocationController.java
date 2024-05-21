package de.dhbw.softwareengineering.deinProjektname.plugins.rest;


import de.dhbw.softwareengineering.deinProjektname.application.services1.LocationService;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService slocationService;

    @GetMapping("/location/{id}")
    public LocationEntity findById(@PathVariable Long id) {
        return slocationService.getById(id);
    }

    @GetMapping("/location/{name}")
    public String name(@PathVariable String name) {
        return "location: " + name;
    }

    @GetMapping("/location/all")
    public List<LocationEntity> getAllLocations() {
        return slocationService.findAll();
    }

    @PostMapping("/location")
    public LocationEntity creatLocation(@RequestBody LocationEntity body) {
        return slocationService.createLocation(body);
    }
}
