package de.dhbw.softwareengineering.deinProjektname.application.services1;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.LocationEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.repositories.LocationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;


    public void deleteById(Long id) {
        Objects.requireNonNull(id);
        locationRepository.deleteById(id);
    }

    public LocationEntity getById(Long id) {
        Objects.requireNonNull(id);
        Optional<LocationEntity> optionalEntity = locationRepository.getById(id);
        if(optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("No location with id " + id);
        }
        return optionalEntity.get();

    }

    public LocationEntity createLocation(LocationEntity ee) {
        return locationRepository.save(ee);
    }

    public List<LocationEntity> findAll() {
        return locationRepository.all();
    }

}
