package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;

import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.SpendingSumLimiterDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.SpendingSumLimiterEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class SpendingSumLimiterDtoToEntityMapper implements Function<SpendingSumLimiterDto, SpendingSumLimiterEntity> {

    @Autowired
    public SpendingSumLimiterDtoToEntityMapper() {
    }

    @Override
    public SpendingSumLimiterEntity apply(SpendingSumLimiterDto spendingSumLimiterDto) {
        return new SpendingSumLimiterEntity(spendingSumLimiterDto.getId(), spendingSumLimiterDto.getMaxSpendingSum());
    }

    public SpendingSumLimiterEntity update(SpendingSumLimiterEntity oldExample, SpendingSumLimiterDto newExample) {
        return new SpendingSumLimiterEntity(
                oldExample.getId(),
                newExample.getMaxSpendingSum()
        );
    }
}
