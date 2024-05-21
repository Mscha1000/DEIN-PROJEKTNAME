package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;

import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.MethodDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class MethodDtoToEntityMapper implements Function<MethodDto, MethodEntity> {

    @Autowired
    public MethodDtoToEntityMapper() {
    }

    @Override
    public MethodEntity apply(MethodDto methodDto) {
        return new MethodEntity(methodDto.getName());
    }

    public MethodEntity update(MethodEntity oldExample, MethodDto newExample) {
        return new MethodEntity(
                newExample.getName()
        );
    }
}
