package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;


import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.MethodRepository;
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
        return springMethodRepository.save(e);
    }

    @Override
    public void deleteById(String id) {
        springMethodRepository.deleteById(id);
    }

    @Override
    public Optional<MethodEntity> getById(String id) {
        // TODO Auto-generated method stub
        return springMethodRepository.findById(id);
    }

    @Override
    public List<MethodEntity> all() {
        // TODO Auto-generated method stub
        return springMethodRepository.findAll();

    }


}
