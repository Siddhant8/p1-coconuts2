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
    CommandLineRunner initDatabase(CovidRepository repository, JukeBoxRepository songRepository) {
        //NOTE: the parameter above says "CovidRepository repository" which means it must use CovidRepository in this section!

        return args -> {
            log.info("Preloading " + repository.save(new Covid("0-9", 13587)));
            log.info("Preloading " + repository.save(new Covid("10-19", 27717)));
            log.info("Preloading" + repository.save(new Covid("20-29", 55906)));
            log.info("Preloading " + repository.save(new Covid("30-39", 44833)));
            log.info("Preloading " + repository.save(new Covid("40-49", 36154)));
            log.info("Preloading " + repository.save(new Covid("50-59", 34438)));
            log.info("Preloading " + repository.save(new Covid("60-69", 22289)));
            log.info("Preloading " + repository.save(new Covid("70-79", 10571)));
            log.info("Preloading " + repository.save(new Covid("80+", 7961)));

            log.info("Preloading " + songRepository.save(new JukeBoxModel()));
            log.info("Preloading " + songRepository.save(new JukeBoxModel("https://youtu.be/BLZWkjBXfN8")));


        };
    }
}
