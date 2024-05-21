package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;

import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.MarketDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class MarketDtoToEntityMapper implements Function<MarketDto, MarketEntity> {

    @Autowired
    public MarketDtoToEntityMapper() {}

    @Override
    public MarketEntity apply(MarketDto marketDto) {

        return new MarketEntity(marketDto.getId(), marketDto.getName(), marketDto.getLocation());
    }

    public MarketEntity update(MarketEntity oldExample, MarketDto newExample) {
        return new MarketEntity(
                oldExample.getId(),
                newExample.getName(),
                newExample.getLocation()
        );
    }

}
