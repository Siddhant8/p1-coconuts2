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


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/cases")
    List<Covid> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/cases")
    Covid newEmployee(@RequestBody Covid newCovid) {
        return repository.save(newCovid);
    }

    // Single item

    @GetMapping("/cases/{id}")
    Covid one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new CovidNotFoundException(id));
    }

    @PutMapping("/cases/{id}")
    Covid replaceCovid(@RequestBody Covid newCovid, @PathVariable Long id) {

        return repository.findById(id)
                .map(covid -> {
                    covid.setDay(newCovid.getDay());
                    covid.setNumber(newCovid.getNumber());
                    return repository.save(covid);
                })
                .orElseGet(() -> {
                    newCovid.setId(id);
                    return repository.save(newCovid);
                });
    }

    //@DeleteMapping("/cases/{id}")
    //void deleteCovid(@PathVariable Long id) {
        //repository.deleteById(id);
    //}



}
