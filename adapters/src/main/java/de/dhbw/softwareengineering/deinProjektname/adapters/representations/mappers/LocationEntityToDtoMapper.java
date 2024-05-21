package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;


import de.dhbw.softwareengineering.deinProjektname.adapters.representations.LocationDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LocationEntityToDtoMapper implements Function<LocationEntity, LocationDto> {

    @Lazy
    @Autowired
    public LocationEntityToDtoMapper() {

    }

    @Override
    public LocationDto apply(LocationEntity locationEntity) {
        return new LocationDto(
                locationEntity.getId(),
                locationEntity.getCountry(),
                locationEntity.getZipCode(),
                locationEntity.getCity(),
                locationEntity.getStreet(),
                locationEntity.getNumber());
    }



}
