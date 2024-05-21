package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringCategoryRepository extends JpaRepository<CategoryEntity, String> {
}
