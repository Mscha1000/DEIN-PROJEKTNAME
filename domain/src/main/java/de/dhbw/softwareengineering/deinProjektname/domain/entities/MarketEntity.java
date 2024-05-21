package de.dhbw.softwareengineering.deinProjektname.domain.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "Market")
public class MarketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "Location")
    private LocationEntity location;

    public MarketEntity(Long id, String name, LocationEntity location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    protected MarketEntity() {

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
