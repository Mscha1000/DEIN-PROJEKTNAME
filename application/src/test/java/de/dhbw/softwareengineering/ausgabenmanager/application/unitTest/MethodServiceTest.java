package de.dhbw.softwareengineering.ausgabenmanager.application.unitTest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.MethodService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class MethodServiceTest {

    @Autowired
    private MethodService methodService;


    @Test
    public void testAddMarkt() {
        MethodEntity methodEntity = new MethodEntity("Barzahlung");

        MethodEntity savedMethod = methodService.createMethod(methodEntity);

        assertNotNull(savedMethod);
        assertNotNull(savedMethod.getName());
    }

    @Test
    public void testGetAllMethods() {
        List<MethodEntity> methods = methodService.findAll();
        assertFalse(methods.isEmpty());
    }


    @Test
    public void testDeleteMarket() {
        MethodEntity methodEntity = new MethodEntity("Kreditkartenzahlung");
        MethodEntity savedMethod = methodService.createMethod(methodEntity);

        methodService.deleteById(savedMethod.getName());

        Optional<MethodEntity> foundMethod = Optional.ofNullable(methodService.getById(savedMethod.getName()));
        assertFalse(foundMethod.isPresent());
    }

}
