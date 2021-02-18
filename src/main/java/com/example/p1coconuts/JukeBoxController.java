package com.example.p1coconuts;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JukeBoxController {
    //connects jukebox.html to the webpage
    @GetMapping("/jukebox")
    public String greeting(){
        return "jukebox";
    }
}

