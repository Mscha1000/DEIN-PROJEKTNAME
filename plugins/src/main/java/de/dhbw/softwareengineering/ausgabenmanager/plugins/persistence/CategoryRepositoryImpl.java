package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.CategoryRepository;
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
        return springCategoryRepository.save(e);
    }


    @Override
    public void deleteById(String id) {
        springCategoryRepository.deleteById(id);
    }

    @Override
    public Optional<CategoryEntity> getById(String id) {
        // TODO Auto-generated method stub
        return springCategoryRepository.findById(id);
    }

    @Override
    public List<CategoryEntity> all() {

        // TODO Auto-generated method stub
        return springCategoryRepository.findAll();

    }

}
