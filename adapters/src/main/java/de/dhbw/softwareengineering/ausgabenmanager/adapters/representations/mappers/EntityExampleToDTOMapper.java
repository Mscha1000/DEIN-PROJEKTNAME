package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.EntityExampleDTO;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.EntityExample;

@Component
public class EntityExampleToDTOMapper implements Function<EntityExample, EntityExampleDTO> {

    @Lazy
    @Autowired
    public EntityExampleToDTOMapper() {

    }

    @Override
    public EntityExampleDTO apply(EntityExample entityExample) {
       return new EntityExampleDTO(
    		   entityExample.getId(),
    		   entityExample.getName());
    }
}
