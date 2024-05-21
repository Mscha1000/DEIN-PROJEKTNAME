package de.dhbw.softwareengineering.deinProjektname.adapters.representations;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.MarketEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;

import java.util.Date;

public class PurchaseDto {

    private Long id;

    private String name;

    private Date date;

    private double cost;

    private String category;

    private MethodEntity method;

    private MarketEntity market;

    public PurchaseDto(Long id, String name, Date date, double cost, String category, MethodEntity method, MarketEntity market) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public MethodEntity getMethod() {
        return method;
    }

    public void setMethod(MethodEntity method) {
        this.method = method;
    }

    public MarketEntity getMarket() {
        return market;
    }

    public void setMarket(MarketEntity market) {
        this.market = market;
    }
}
