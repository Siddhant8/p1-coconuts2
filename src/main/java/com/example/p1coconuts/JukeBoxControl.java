package com.example.p1coconuts;


//NOTE: this is NOT the same as JukeBox CONTROLLER!!!1111!!!!
import javax.swing.*;
import java.io.IOException;

public class JukeBoxControl {

    JukeBoxModel model;
    //JukeBoxUI view; Fix me to work with HTML instead


    public JukeBoxControl() throws IOException {

        this.model = new JukeBoxModel();
        //this.view = new JukeBoxUI(this); //standard MVC style   Convert to HTML
       // view.setVisible(true);  Outdated


    }

}
