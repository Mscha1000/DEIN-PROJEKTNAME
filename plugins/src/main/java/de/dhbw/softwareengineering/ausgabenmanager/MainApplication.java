package de.dhbw.softwareengineering.ausgabenmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "de.dhbw.softwareengineering.ausgabenmanager.plugins")
@EntityScan("de.dhbw.softwareengineering.ausgabenmanager.domain.entities")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
