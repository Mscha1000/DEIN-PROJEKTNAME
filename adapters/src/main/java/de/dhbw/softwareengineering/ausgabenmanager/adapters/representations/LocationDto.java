package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations;

public class LocationDto {

    private Long id;

    private String country;

    private int zipCode;

    private String city;

    private String street;

    private int number;

    public LocationDto(Long id, String country, int zipCode, String city, String street, int number) {
        this.id = id;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
