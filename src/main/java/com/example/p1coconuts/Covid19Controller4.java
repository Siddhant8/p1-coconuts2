package com.example.p1coconuts;
import com.example.p1coconuts.CovidCases;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

@Controller
public class Covid19Controller4{
    @GetMapping("/covid4")
    public String covid2(@RequestParam(name="days", required=false,  defaultValue="10") String days, Model model) throws IOException {
        int nth = Integer.parseInt(days);

        model.addAttribute("days", CovidCases4.driver(nth));
        return "starters/covid194";
    }
}
