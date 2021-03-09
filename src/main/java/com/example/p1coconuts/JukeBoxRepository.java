package com.example.p1coconuts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JukeBoxRepository extends JpaRepository<JukeBoxModel, Long> {

    //Domain type: JukeBoxModel . Id type: Long <-- use a number to store the strings
        //The domain type is the column within our database.

    //A String needs to be passed in so that the database stores URLs

    //We MUST define it as an interface instead of a class! I wonder... what exactly is an interface?

}
