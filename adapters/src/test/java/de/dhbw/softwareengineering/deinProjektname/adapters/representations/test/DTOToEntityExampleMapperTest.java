package de.dhbw.softwareengineering.deinProjektname.adapters.representations.test;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.EntityExampleDTO;
import de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers.DTOToEntityExampleMapper;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.EntityExample;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DTOToEntityExampleMapperTest {

    DTOToEntityExampleMapper classUnderTest = new DTOToEntityExampleMapper();

    @Test
    void mapDtoToEntity() {
        String name = "Testname";

       /* EntityExampleDTO dto = new EntityExampleDTO();
        dto.setName(name);

        EntityExample entity = classUnderTest.mapDtoToEntity(dto);

        assertEquals(entity.getName(), name);
        assertEquals(entity.getId(), id);*/



    }

}
