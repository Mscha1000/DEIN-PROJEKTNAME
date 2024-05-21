package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations;


public class SpendingSumLimiterDto {

    private Long id;

    private double maxSpendingSum;

    public SpendingSumLimiterDto(Long id, double maxSpendingSum) {
        this.id = id;
        this.maxSpendingSum = maxSpendingSum;
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
