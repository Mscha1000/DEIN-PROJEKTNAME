package de.dhbw.softwareengineering.deinProjektname.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Category")
public class CategoryEntity {

    @Id
    private String name;


    public CategoryEntity(String name) {
        this.name = name;
    }

    protected CategoryEntity() {
    }


    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

}
