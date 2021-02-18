package com.example.p1coconuts;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@RestController
public class CovidController {

    private final CovidRepository repository;

    CovidController(CovidRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/cases")
    List<Covid> all() {
        return repository.findAll();
    }

    @PostMapping("/cases")
    Covid newCase(@RequestBody Covid newCovid) {
        return repository.save(newCovid);
    }


    /*@GetMapping("/cases/{id}")
    Covid one(@PathVariable Long id) {

        return repository.findById(id);
                //.orElseThrow(() -> new CovidNotFoundException(id));
    }*/

    @PutMapping("/cases/{id}")
    Covid replaceCovid(@RequestBody Covid newCovid, @PathVariable Long id) {

        return repository.findById(id)
                .map(covid -> {
                    covid.setAge(newCovid.getAge());
                    covid.setNumber(newCovid.getNumber());
                    return repository.save(covid);
                })
                .orElseGet(() -> {
                    newCovid.setId(id);
                    return repository.save(newCovid);
                });
    }

}
