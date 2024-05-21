package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;


import de.dhbw.softwareengineering.deinProjektname.adapters.representations.MethodDto;
import de.dhbw.softwareengineering.deinProjektname.adapters.representations.PurchaseDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
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
