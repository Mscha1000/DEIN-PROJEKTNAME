package de.dhbw.softwareengineering.deinProjektname.application.services1;


import de.dhbw.softwareengineering.deinProjektname.domain.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public void deleteById(String name) {
        repository.deleteById(name);
    }

}
