package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;

import java.util.Date;

public class PurchaseDto {

    private Long id;

    private String name;

    private Date date;

    private double cost;

    private CategoryEntity category;

    private MethodEntity method;

    private MarketEntity market;

    public PurchaseDto(Long id, String name, Date date, double cost, CategoryEntity category, MethodEntity method, MarketEntity market) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.cost = cost;
        this.category = category;
        this.method = method;
        this.market = market;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public MethodEntity getMethod() {
        return method;
    }

    public void setMethod(MethodEntity method) {
        this.method = method;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public MarketEntity getMarket() {
        return market;
    }

    public void setMarket(MarketEntity market) {
        this.market = market;
    }
}
