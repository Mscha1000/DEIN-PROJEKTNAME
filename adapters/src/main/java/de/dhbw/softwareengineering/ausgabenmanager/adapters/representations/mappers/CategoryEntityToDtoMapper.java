package de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.mappers;


import de.dhbw.softwareengineering.ausgabenmanager.adapters.representations.CategoryDto;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
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
