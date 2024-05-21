package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.PurchaseDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class PurchaseDtoToEntityMapper implements Function<PurchaseDto, PurchaseEntity> {

    @Autowired
    public PurchaseDtoToEntityMapper() {
    }

    @Override
    public PurchaseEntity apply(PurchaseDto purchaseDto) {

        return new PurchaseEntity(purchaseDto.getId(), purchaseDto.getName(), purchaseDto.getDate(),
                purchaseDto.getCost(), purchaseDto.getCategory(), purchaseDto.getMethod(), purchaseDto.getMarket());
    }

    public PurchaseEntity update(PurchaseEntity oldExample, PurchaseDto newExample) {
        return new PurchaseEntity(
                oldExample.getId(),
                newExample.getName(),
                newExample.getDate(),
                newExample.getCost(),
                newExample.getCategory(),
                newExample.getMethod(),
                newExample.getMarket()
        );
    }

}
