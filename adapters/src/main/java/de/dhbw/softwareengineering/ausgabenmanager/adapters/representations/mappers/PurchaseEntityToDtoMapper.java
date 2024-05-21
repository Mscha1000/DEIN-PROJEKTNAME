package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;


import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.PurchaseDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.PurchaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PurchaseEntityToDtoMapper implements Function<PurchaseEntity, PurchaseDto> {

    @Lazy
    @Autowired
    public PurchaseEntityToDtoMapper() {

    }

    @Override
    public PurchaseDto apply(PurchaseEntity purchaseEntity) {
        return new PurchaseDto(
                purchaseEntity.getId(),
                purchaseEntity.getName(),
                purchaseEntity.getDate(),
                purchaseEntity.getCost(),
                purchaseEntity.getCategory(),
                purchaseEntity.getMethod(),
                purchaseEntity.getMarket());
    }

}
