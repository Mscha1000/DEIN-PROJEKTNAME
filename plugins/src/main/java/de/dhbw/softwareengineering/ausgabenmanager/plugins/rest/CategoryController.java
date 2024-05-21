package de.dhbw.softwareengineering.ausgabenmanager.plugins.rest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.CategoryService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/id/{id}")
    public CategoryEntity findById(@PathVariable String id) {
        return categoryService.getById(id);
    }

    @GetMapping("/category/all")
    public List<CategoryEntity> getAllCategories() {
        return categoryService.findAll();
    }

    @PostMapping("/category/create")
    public CategoryEntity createCategory(@RequestBody CategoryEntity body) {
        return categoryService.createCategory(body);
    }

    @DeleteMapping("/category/delete/{id}")
    public CategoryEntity deleteById(@PathVariable Long id) {
        return null;
    }

}
