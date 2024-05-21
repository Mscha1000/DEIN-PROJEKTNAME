package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;


import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.MethodDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MethodEntityToDtoMapper implements Function<MethodEntity, MethodDto> {

    @Lazy
    @Autowired
    public MethodEntityToDtoMapper() {

    }

    @Override
    public MethodDto apply(MethodEntity methodEntity) {
        return new MethodDto(
                methodEntity.getName());
    }

}
