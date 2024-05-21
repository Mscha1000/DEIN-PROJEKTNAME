package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.CategoryDto;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class CategoryDtoToEntityMapper implements Function<CategoryDto, CategoryEntity> {

    @Autowired
    public CategoryDtoToEntityMapper() {
    }

    @Override
    public CategoryEntity apply(CategoryDto categoryDto) {
        return new CategoryEntity(categoryDto.getName());
    }

    public CategoryEntity update(CategoryEntity oldExample, CategoryDto newExample) {
        return new CategoryEntity(
                newExample.getName()
        );
    }

}
