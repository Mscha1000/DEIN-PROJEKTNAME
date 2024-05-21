package de.dhbw.softwareengineering.deinProjektname.domain.repositories;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.CategoryEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    CategoryEntity save(CategoryEntity e);

    void deleteById(String name);

    Optional<CategoryEntity> getByName(String name);

    List<CategoryEntity> all();
}
