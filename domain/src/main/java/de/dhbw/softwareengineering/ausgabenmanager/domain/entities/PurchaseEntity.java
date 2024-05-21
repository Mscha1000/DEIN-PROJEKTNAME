package de.dhbw.softwareengineering.ausgabenmanager.domain.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Purchase")
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Date date;

    @Column
    private double cost;

    @ManyToOne
    @JoinColumn(name = "Category")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "Method")
    private MethodEntity method;

    @ManyToOne
    @JoinColumn (name = "Market")
    private MarketEntity market;

    public PurchaseEntity(Long id, String name, Date date, double cost, CategoryEntity category, MethodEntity method, MarketEntity market) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.cost = cost;
        this.category = category;
        this.method = method;
        this.market = market;
    }

    protected PurchaseEntity() {

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

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
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
