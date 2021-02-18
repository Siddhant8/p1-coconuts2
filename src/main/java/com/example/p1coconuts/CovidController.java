package com.example.p1coconuts;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@RestController
public class CovidController {

    private final CovidRepository repository;

    public CovidController(CovidRepository repository) {
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


}
