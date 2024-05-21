package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.EntityExample;
@Repository
public interface springDataForBridge extends JpaRepository<EntityExample, String> {

}
