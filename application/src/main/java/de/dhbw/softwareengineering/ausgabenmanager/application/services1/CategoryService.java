package de.dhbw.softwareengineering.ausgabenmanager.application.services1;


import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void deleteById(String id) {
        Objects.requireNonNull(id);
        categoryRepository.deleteById(id);
    }

    public CategoryEntity getById(String id) {
        Objects.requireNonNull(id);
        Optional<CategoryEntity> optionalEntity = categoryRepository.getById(id);
        if(optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("No category with id :" + id + ":");
        }
        return optionalEntity.get();

    }

    public CategoryEntity createCategory(CategoryEntity ee) {
        return categoryRepository.save(ee);
    }

    public List<CategoryEntity> findAll() {
        return categoryRepository.all();
    }

}
