package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpringLocationRepository extends JpaRepository<LocationEntity, Long> {
}
