package com.example.p1coconuts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CovidRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Covid("1", "50")));
            log.info("Preloading " + repository.save(new Covid("2", "100")));
            log.info("Preloading" + repository.save(new Covid("3", "200")));
        };
    }
}
