package com.example.p1coconuts;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
class JukeBoxRepositoryController {

    private final JukeBoxRepository repository;

    JukeBoxRepositoryController(JukeBoxRepository repository) { //This is a constructor!111!!!11!
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/jukeboxdata")
    List<JukeBoxModel> all() {
        return repository.findAll();
    }

    // end::get-aggregate-root[]


    @PostMapping("/jukeboxdata")
    JukeBoxModel newSong(@RequestBody JukeBoxModel newSong) {
        return repository.save(newSong);
    }

    // Single item

    @GetMapping("/jukeboxdata/{id}")
    JukeBoxModel one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new SongNotFoundException(id));
    }

    @PutMapping("/jukeboxdata/{id}")
    JukeBoxModel replaceSong(@RequestBody JukeBoxModel newSong, @PathVariable Long id) { //this one's important because it will allow us to replace data

        return repository.findById(id)
                .map(song -> {
                    song.setUrl(newSong.getUrl());
                    return repository.save(song);
                })
                .orElseGet(() -> {
                    newSong.setId(id);
                    return repository.save(newSong);
                });
    }

    @DeleteMapping("/jukeboxdata/{id}")
    void deleteSong(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
