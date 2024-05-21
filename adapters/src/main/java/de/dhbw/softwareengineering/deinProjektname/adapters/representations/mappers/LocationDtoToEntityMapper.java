package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.LocationDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class LocationDtoToEntityMapper implements Function<LocationDto, LocationEntity> {

    @Autowired
    public LocationDtoToEntityMapper(){

    }

    @Override
    public LocationEntity apply(LocationDto locationDto) {

        return new LocationEntity(locationDto.getId(), locationDto.getCountry(), locationDto.getZipCode(),
                locationDto.getCity(), locationDto.getStreet(), locationDto.getNumber());
    }

    public LocationEntity update(LocationEntity oldExample, LocationDto newExample) {
        return new LocationEntity(
                oldExample.getId(),
                newExample.getCountry(),
                newExample.getZipCode(),
                newExample.getCity(),
                newExample.getStreet(),
                newExample.getNumber());
    }

}
