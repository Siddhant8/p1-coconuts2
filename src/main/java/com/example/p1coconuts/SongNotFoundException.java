package com.example.p1coconuts;

class SongNotFoundException extends RuntimeException {

    SongNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
