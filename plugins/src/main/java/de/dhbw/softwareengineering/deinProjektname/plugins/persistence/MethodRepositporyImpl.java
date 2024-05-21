package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;


import de.dhbw.softwareengineering.deinProjektname.domain.entities.MethodEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.PurchaseEntity;
import de.dhbw.softwareengineering.deinProjektname.domain.repositories.MethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MethodRepositporyImpl implements MethodRepository {

    @Autowired
    SpringMethodRepository springMethodRepository;

    @Override
    public MethodEntity save(MethodEntity e) {
        return null;
    }

    @Override
    public void deleteById(String name) {
        springMethodRepository.deleteById(name);
    }

    @Override
    public Optional<MethodEntity> getByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<MethodEntity> all() {
        return null;
    }



}
