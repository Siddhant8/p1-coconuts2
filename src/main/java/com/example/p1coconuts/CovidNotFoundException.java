package com.example.p1coconuts;

public class CovidNotFoundException extends RuntimeException {
    public CovidNotFoundException(Long id) {
        super("Could not find case " + id);
    }
}
