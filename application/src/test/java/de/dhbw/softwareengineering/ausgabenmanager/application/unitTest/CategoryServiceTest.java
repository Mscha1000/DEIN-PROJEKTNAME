package de.dhbw.softwareengineering.ausgabenmanager.application.unitTest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.CategoryService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class CategoryServiceTest {


    @Autowired
    private CategoryService categoryService;

    @Test
    public void testAddCategory() {
        CategoryEntity categoryEntity = new CategoryEntity("Lebensmittel");
        CategoryEntity savedCategory = categoryService.createCategory(categoryEntity);
        assertNotNull(savedCategory);
        assertNotNull(savedCategory.getName());
    }

    @Test
    public void testGetAllCategories() {
        List<CategoryEntity> categories = categoryService.findAll();
        assertFalse(categories.isEmpty());
    }


    @Test
    public void testDeleteMarket() {
        CategoryEntity categoryEntity = new CategoryEntity("Unterhaltung");
        CategoryEntity savedCategory = categoryService.createCategory(categoryEntity);

        categoryService.deleteById(savedCategory.getName());

        Optional<CategoryEntity> foundCategory = Optional.ofNullable(categoryService.getById(savedCategory.getName()));
        assertFalse(foundCategory.isPresent());
    }
}
