package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.MarketDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.MarketEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;


@Component
public class MarketEntityToDtoMapper implements Function<MarketEntity, MarketDto> {

    @Lazy
    @Autowired
    public MarketEntityToDtoMapper() {

    }

    @Override
    public MarketDto apply(MarketEntity marketEntity) {
        return new MarketDto(
                marketEntity.getId(),
                marketEntity.getName(),
                marketEntity.getLocation());
    }
}
