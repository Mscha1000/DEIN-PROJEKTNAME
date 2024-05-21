package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.LocationEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocationRepositoryImpl implements LocationRepository {

    @Autowired
    SpringLocationRepository springLocationRepository;

    @Override
    public LocationEntity save(LocationEntity e) {
        return springLocationRepository.save(e);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<LocationEntity> getById(Long id) {
        // TODO Auto-generated method stub
        return springLocationRepository.findById(id);
    }

    @Override
    public List<LocationEntity> all() {
        // TODO Auto-generated method stub
        return springLocationRepository.findAll();
    }
}
