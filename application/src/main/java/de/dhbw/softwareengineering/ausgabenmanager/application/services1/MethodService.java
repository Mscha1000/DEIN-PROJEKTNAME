package de.dhbw.softwareengineering.ausgabenmanager.application.services1;

import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.MethodRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MethodService {

    @Autowired
    private MethodRepository methodRepository;

    public void deleteById(String id) {
        Objects.requireNonNull(id);
        methodRepository.deleteById(id);
    }

    public MethodEntity getById(String id) {
        Objects.requireNonNull(id);
        Optional<MethodEntity> optionalEntity = methodRepository.getById(id);
        if(optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("No market with id " + id);
        }
        return optionalEntity.get();

    }

    public MethodEntity createMethod(MethodEntity ee) {
        return methodRepository.save(ee);
    }

    public List<MethodEntity> findAll() {
        return methodRepository.all();
    }

}
