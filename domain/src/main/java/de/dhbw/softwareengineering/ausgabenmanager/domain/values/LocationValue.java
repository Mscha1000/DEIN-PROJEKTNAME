package de.dhbw.softwareengineering.ausgabenmanager.domain.values;

import jakarta.persistence.*;

@Embeddable
public class LocationValue {

    private String country;
    private String zipCode;
    private String city;
    private String street;
    private String number;


    public LocationValue() {
    }

    public LocationValue(String country, String zipCode, String city, String street, String number) {
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.number = number;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}