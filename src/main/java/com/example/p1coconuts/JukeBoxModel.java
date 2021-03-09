package com.example.p1coconuts;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //<-- need this to produce a database
public class JukeBoxModel {




    private @Id @GeneratedValue Long id; //Need integer to define the key, youtubeUrl is the value.

    String youtubeUrl = ""; //Had to delete a bunch of methods that no longer were used (had to do with file writing)
    //Youtube url will be the value for the id above
    //This IS my POJO

    public JukeBoxModel() {
        youtubeUrl = "https://youtu.be/fTczCpIaLAU"; //Default parameter has default value of Persona 4 Specialist video
    }

    public JukeBoxModel (String input){ //a second constructor to construct new classes from an html input
        youtubeUrl = input;
    } //Application of multiple


    //Databases rely on getters and settters to send things to and from

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUrl (){
        return youtubeUrl;
    }

    public void setUrl(String input){
        this.youtubeUrl = input;   //I didn't have getters and setters prewritten that weren't designed for arrayLists
    }


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof JukeBoxModel))
            return false;
        JukeBoxModel song = (JukeBoxModel) o;
        return Objects.equals(this.id, song.id) && Objects.equals(this.youtubeUrl, song.youtubeUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.youtubeUrl);
    }


    @Override
    public String toString() {
        return "Song{" + "id=" + this.id + ", name='" + this.youtubeUrl + '\'' + '}'; }

    //Plan: be able to connect to database, set a limit of 9 URLs. As each URL is filled out, a new video appears in a 3x3 table.
    //Override current URL's by adding to a stack. Stack is a set of 9 URL's.

}

