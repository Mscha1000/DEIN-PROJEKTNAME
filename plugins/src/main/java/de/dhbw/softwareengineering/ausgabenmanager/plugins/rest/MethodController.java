package de.dhbw.softwareengineering.ausgabenmanager.plugins.rest;

import de.dhbw.softwareengineering.ausgabenmanager.application.services1.MethodService;
import de.dhbw.softwareengineering.ausgabenmanager.domain.entities.MethodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MethodController {

        @Autowired
        private MethodService methodService;

        @GetMapping("/method/id/{id}")
        public MethodEntity findById(@PathVariable String id) {
            return methodService.getById(id);
        }

        @GetMapping("/method/all")
        public List<MethodEntity> getAllMethods() {
            return methodService.findAll();
        }

        @PostMapping("/method/create")
        public MethodEntity createMethod(@RequestBody MethodEntity body) {
            return methodService.createMethod(body);
        }

        @DeleteMapping("/method/delete/{id}")
        public MethodEntity deleteById(@PathVariable Long id) {
            return null;
        }


}