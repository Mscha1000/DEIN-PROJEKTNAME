package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringCategoryRepository extends JpaRepository<CategoryEntity, String> {
}
