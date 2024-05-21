package de.dhbw.softwareengineering.ausgabenmanager.domain.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Method")
public class MethodEntity {

    @Id
    @Column
    private String name;

    public MethodEntity(String name) {
        this.name = name;
    }

    protected MethodEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
