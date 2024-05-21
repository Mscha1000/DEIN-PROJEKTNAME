package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;

import java.util.function.Function;

import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.EntityExampleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.EntityExample;

@Component
public class DTOToEntityExampleMapper implements Function<EntityExampleDTO, EntityExample> {

    @Autowired
    public DTOToEntityExampleMapper() {
    }

    @Override
    public EntityExample apply(EntityExampleDTO entityExampleDTO) {
    	
    	return new EntityExample(entityExampleDTO.getId(), entityExampleDTO.getName());
    }

    public EntityExample update(EntityExample oldExample, EntityExampleDTO newExample) {
        return new EntityExample(
        		oldExample.getId(),
                newExample.getName()
        );
    }

}
