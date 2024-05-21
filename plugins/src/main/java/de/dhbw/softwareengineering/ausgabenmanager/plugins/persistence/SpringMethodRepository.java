package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringMethodRepository extends JpaRepository<MethodEntity, String> {

}
