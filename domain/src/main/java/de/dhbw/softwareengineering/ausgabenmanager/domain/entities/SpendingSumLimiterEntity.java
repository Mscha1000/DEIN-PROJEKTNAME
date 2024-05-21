package de.dhbw.softwareengineering.ausgabenmanager.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MaxSum")
public class SpendingSumLimiterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private double maxSpendingSum;

    public SpendingSumLimiterEntity(Long id, double maxSpendingSum) {
        this.id = id;
        this.maxSpendingSum = maxSpendingSum;
    }

    protected SpendingSumLimiterEntity() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaxSpendingSum() {
        return maxSpendingSum;
    }

    public void setMaxSpendingSum(double maxSpendingSum) {
        this.maxSpendingSum = maxSpendingSum;
    }
}
