package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringMethodRepository extends JpaRepository<MethodEntity, String> {

}
