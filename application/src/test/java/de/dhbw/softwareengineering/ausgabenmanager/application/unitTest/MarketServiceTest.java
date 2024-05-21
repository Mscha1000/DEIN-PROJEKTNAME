package de.dhbw.softwareengineering.ausgabenmanager.application.unitTest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.MarketService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MarketEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.values.LocationValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;


@SpringBootTest
public class MarketServiceTest {


    @Autowired
    private MarketService marketService;


    @Test
    public void testAddMarkt() {
        MarketEntity marketEntity = new MarketEntity(1L, "Wochenmarkt", new LocationValue("DE" ,"73262","Esslingen","Esslinger Straße", "5"));

        MarketEntity savedMarket = marketService.createMarket(marketEntity);

        assertNotNull(savedMarket);
        assertNotNull(savedMarket.getId());
    }

    @Test
    public void testGetAllMarkets() {
        List<MarketEntity> markets = marketService.findAll();
        assertFalse(markets.isEmpty());
    }


    @Test
    public void testDeleteMarket() {
        MarketEntity marketEntity = new MarketEntity(1L, "Wochenmarkt", new LocationValue("DE" ,"73262","Esslingen","Esslinger Straße", "5"));
        MarketEntity savedMarket = marketService.createMarket(marketEntity);

        marketService.deleteById(savedMarket.getId());

        Optional<MarketEntity> foundMarkt = Optional.ofNullable(marketService.getById(savedMarket.getId()));
        assertFalse(foundMarkt.isPresent());
    }


}
