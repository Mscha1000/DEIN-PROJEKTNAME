package de.dhbw.softwareengineering.ausgabenmanager.domain.repositories;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    CategoryEntity save(CategoryEntity e);

    void deleteById(String name);

    Optional<CategoryEntity> getById(String name);

    List<CategoryEntity> all();
}
