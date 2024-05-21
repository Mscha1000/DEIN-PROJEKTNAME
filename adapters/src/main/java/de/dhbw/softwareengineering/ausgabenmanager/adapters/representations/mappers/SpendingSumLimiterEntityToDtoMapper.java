package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;


import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.SpendingSumLimiterDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class SpendingSumLimiterEntityToDtoMapper implements Function<SpendingSumLimiterEntity, SpendingSumLimiterDto> {

    @Lazy
    @Autowired
    public SpendingSumLimiterEntityToDtoMapper() {
    }

    @Override
    public SpendingSumLimiterDto apply(SpendingSumLimiterEntity spendingSumLimiterEntity) {
        return new SpendingSumLimiterDto(
                spendingSumLimiterEntity.getId(),
                spendingSumLimiterEntity.getMaxSpendingSum());
    }

}
