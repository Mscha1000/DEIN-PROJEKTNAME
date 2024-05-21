package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;


import de.dhbw.softwareengineering.deinProjektname.adapters.representations.CategoryDto;
import de.dhbw.softwareengineering.deinProjektname.adapters.representations.MethodDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.CategoryEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CategoryEntityToDtoMapper implements Function<CategoryEntity, CategoryDto> {

    @Lazy
    @Autowired
    public CategoryEntityToDtoMapper() {

    }

    @Override
    public CategoryDto apply(CategoryEntity categoryEntity) {
        return new CategoryDto(
                categoryEntity.getName());
    }
}
