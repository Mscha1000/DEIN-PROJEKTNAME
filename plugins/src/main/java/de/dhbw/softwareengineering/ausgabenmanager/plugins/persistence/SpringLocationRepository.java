package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpringLocationRepository extends JpaRepository<LocationEntity, Long> {
}
