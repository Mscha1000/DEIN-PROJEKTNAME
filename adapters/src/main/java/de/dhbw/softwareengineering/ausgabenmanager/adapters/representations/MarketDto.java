package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations;

import de.dhbw.softwareengineering.ausgabenmanager.domain.values.LocationValue;


public class MarketDto {

    private Long id;

    private String name;

    private LocationValue location;

    public MarketDto(Long id, String name, LocationValue location) {
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

    public LocationValue getLocation() {
        return location;
    }

    public void setLocation(LocationValue location) {
        this.location = location;
    }

}
