package de.dhbw.softwareengineering.deinProjektname.adapters.representations;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.LocationEntity;


public class MarketDto {

    private Long id;

    private String name;

    private LocationEntity location;

    public MarketDto(Long id, String name, LocationEntity location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

}
