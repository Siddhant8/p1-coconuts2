package com.example.p1coconuts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class JukeBoxController {

    @Autowired
    private SongSqlRepository SongSqlRepository;

    @GetMapping("/jukebox")
    public String greeting(@RequestParam(name="jukeboxinput", required=false, defaultValue= "https://www.youtube.com/embed/fTczCpIaLAU") String name, Model model) throws IOException {
        //Syntax: String name is set to the annotator @RequestParam. String name can be used for anything else afterwards. Don't even need String URL.
        //public String greeting is just a method, and greeting is a keyword thats known.

        //What should I set the name to above? Does it fetch the HTML tag?

        //What do "string name" and @RequestParam(name="") do?




        String url = name; //what will this do for me?
        //url = "https://youtu.be/fTczCpIaLAU";

        if (url.equals(null) || url.equals("")){ //empty or null string
            url = "https://youtu.be/fTczCpIaLAU";
            //JukeBoxModel defaultSong = new JukeBoxModel(url);
            //SongSqlRepository.save(defaultSong);

        } else {
            //Save the URL here to ID 10
            //url = "https://youtu.be/fTczCpIaLAU";
            JukeBoxModel newSong = new JukeBoxModel(url);
            //SongSqlRepository.delete(10); //delete the top most information
            //SongSqlRepository.save(newSong); //The added stuff always goes on top

        }

        JukeBoxModel songRecord = new JukeBoxModel(url); //Fix the input-output exception need later (don't want anymore file manipulation)
        //Create new JukeBoxModel, set values, then get those values, then save those values

        //Remember to add HTML instructions!1111!!!!

        //List<JukeBoxModel> songs = SongSqlRepository.listAll();

        //String songsSize = songs.toString(); //use this to see a list of the objects

        //int highestIndex = songs.size() - 1; //<-- -1 to deal with


        //String usedUrl = songs.get(highestIndex).getUrl(); //Append quotation marks to the end... maybe that will help?

        //for (JukeBoxModel song : songs) { //Remember, .listAll returns a list!



        //}




        /*
        if (!(name.equals(null) || name.equals(""))){ //Use name here because url changes at line 31

            //Do the saving here! Need to limit the number of records to 9 <-- delete any value at position 9, shift all values over
            //Does ID start at 0 or 1 ?

            //Need a way to delete the first item <-- what ID is the first item?

            if (SongSqlRepository.get(9).equals(null)){
                //Code to save to database. This should work because it'll add to the next row
                SongSqlRepository.save(songRecord);

            } else if (!(SongSqlRepository.get(9).equals(null))){
                SongSqlRepository.delete(9); //Delete the item in the ninth spot. This is to limit size to 9
                SongSqlRepository.save(songRecord);
            }


        }*/

        //Now make a bunch of Thymeleaf attributes for each of the 9 elements!
        //Use an enhanced/for-each for loop!




        BasicPojo stringReverse = new BasicPojo();

        //String youtubeSong = SongSqlRepository.get(1).getUrl(); //Use ID 11 so that you can delete it and save and not worry about it

        //Plan for JukeBox java attribute generator: returns the normal string unmodified BUT sends it into a database at the same time. It won't just be a return statement



        //stringReverse.reverse(url)
        model.addAttribute("URLinput", url); //This is a Thymeleaf attribute. It can be called in the .html page

        model.addAttribute("reversedInput", stringReverse.reverse(url)); //<-- use this to display top most data row in reverse

        model.addAttribute("inputtedUrl", url); //Use this Thymeleaf attribute to display the youtube video
        //test for if a value exists (isn't null) <-- thymeleaf ifs. Use default value up above in @RequestParam

        //How will I connect an arrayList to an attribute?
        //Use a for loop to render all attributes! <-- do the same thing as before with creating multiple objects


        //Need a way to connect a button to a Java event....

        //Need a way to return items in a list...



        return "/jukebox";} //returns an HTML view <-- reloads the page }

/*
    // GET request,, parameters are passed with URL
    @GetMapping("/fib")
    public String fib(@RequestParam(name="fibseq", required=false,  defaultValue="2") String fibseq, Model model) {
        //nth is fibonacci request
        //Pulls from html. Name of the input on form is name
        //String fibseq stores request form <-- name should be jukeboxinput

        //@requestParam is a decorator for fibseq
        //All from HTML is a string
        int nth = Integer.parseInt(fibseq);

        //fibonacci methods
        FibFor fibfor = new FibFor(nth); //all Java classes
        FibRecurse fibrecurse = new FibRecurse(nth);
        FibStream fibstream = new FibStream(nth);
        FibWhile fibwhile = new FibWhile(nth);

        //MODEL attributes are passed back html
        //(variable name, value)

        //${modelattribute} <-- use thymeleaf syntax in HTML
        model.addAttribute("fib", fibstream.getNth());
        model.addAttribute("fibseq", fibstream.getNthSeq());
        model.addAttribute("fibfortime", fibfor.getTimeElapsed());
        model.addAttribute("fibrecursetime", fibrecurse.getTimeElapsed());
        model.addAttribute("fibstreamtime", fibstream.getTimeElapsed());
        model.addAttribute("fibwhiletime", fibwhile.getTimeElapsed()); //attributes are used in Thymeleaf

        //render fibonacci results
        return "algos/fib"; //Goes to another HTML page
    } */
}
