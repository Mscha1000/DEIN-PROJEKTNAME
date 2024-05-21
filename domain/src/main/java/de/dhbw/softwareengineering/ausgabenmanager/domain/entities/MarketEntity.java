package de.dhbw.softwareengineering.ausgabenmanager.domain.entities;


import de.dhbw.softwareengineering.ausgabenmanager.domain.values.LocationValue;
import jakarta.persistence.*;

@Entity
@Table (name = "Market")
public class MarketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private LocationValue location;

    public MarketEntity(Long id, String name, LocationValue location) {
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

    public LocationValue getLocation() {
        return location;
    }

    public void setLocation(LocationValue location) {
        this.location = location;
    }
}
