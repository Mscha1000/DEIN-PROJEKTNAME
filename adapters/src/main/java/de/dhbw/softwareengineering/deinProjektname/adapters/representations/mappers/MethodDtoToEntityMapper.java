package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.MethodDto;
import de.dhbw.softwareengineering.deinProjektname.adapters.representations.PurchaseDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
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
