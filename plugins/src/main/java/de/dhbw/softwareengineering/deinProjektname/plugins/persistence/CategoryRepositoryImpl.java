package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.CategoryEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    SpringCategoryRepository springCategoryRepository;

    @Override
    public CategoryEntity save(CategoryEntity e) {
        return null;
    }

    @Override
    public void deleteById(String name) {
        springCategoryRepository.deleteById(name);
    }

    @Override
    public Optional<CategoryEntity> getByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<CategoryEntity> all() {
        return null;
    }
}
