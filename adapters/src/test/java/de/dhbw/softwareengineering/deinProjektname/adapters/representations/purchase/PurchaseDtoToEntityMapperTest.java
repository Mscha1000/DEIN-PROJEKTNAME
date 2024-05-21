package de.dhbw.softwareengineering.deinProjektname.adapters.representations.purchase;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers.PurchaseDtoToEntityMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PurchaseDtoToEntityMapperTest {

    PurchaseDtoToEntityMapper classUnderTest = new PurchaseDtoToEntityMapper();
/*
    @Test
    void mapDtoToEntity() {
        String name = "Buchtitel";

        List<String> genres = new ArrayList<>();
        genres.add("Fantasy");
        genres.add("Adventure");

        String zielgruppe = "Erwachsene";

        List<String> vergleichstitel = new ArrayList<>();
        vergleichstitel.add("Ähnliches Buch 1");
        vergleichstitel.add("Ähnliches Buch 2");

        String logline = "Buchlogline";
        String kurzzusammenfassung = "Buchkurzzusammenfassung";

        String inhaltsbeschreibung = "Buchinhaltsbeschreibung";

        List<String> kapitel = new ArrayList<>();
        kapitel.add("Kapitel 1");
        kapitel.add("Kapitel 2");

        BuchDto dto = new BuchDto();
        dto.setTitel(titel);
        dto.setGenres(genres);
        dto.setZielgruppe(zielgruppe);
        dto.setVergleichstitel(vergleichstitel);
        dto.setLogline(logline);
        dto.setKurzzusammenfassung(kurzzusammenfassung);
        dto.setInhaltsbeschreibung(inhaltsbeschreibung);
        dto.setKapitel(kapitel);

        BuchEntity entity = classUnderTest.mapDtoToEntity(dto);

        assertEquals(entity.getTitel(), titel);
        assertEquals(entity.getGenres(), genres);
        assertEquals(entity.getZielgruppe(), zielgruppe);
        assertEquals(entity.getVergleichstitel(), vergleichstitel);
        assertEquals(entity.getLogline(), logline);
        assertEquals(entity.getKurzzusammenfassung(), kurzzusammenfassung);
        assertEquals(entity.getInhaltsbeschreibung(), inhaltsbeschreibung);
        assertEquals(entity.getKapitel(), kapitel);




    }*/
}
