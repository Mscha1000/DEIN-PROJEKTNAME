package de.dhbw.softwareengineering.deinProjektname.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;


public class SumOfPurchasedValueEntity {

    private Date startDate;

    private Date endDate;

    public Date getStartDate() {return startDate;}

    public void setStartDate(Date startDate) {this.startDate = startDate;}

    public Date getEndDate() {return endDate;}

    public void setEndDate(Date endDate) {this.endDate = endDate;}
}
