package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations;


public class MethodDto {

    private String name;

    public MethodDto(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
