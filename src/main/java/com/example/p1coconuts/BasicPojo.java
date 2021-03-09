package com.example.p1coconuts;

public class BasicPojo {

    //Kinematics is lame

    //Do a string algorithm: reverse w/ recursion or iteration or find sequence

    public String reverse(String toReverse){

        int length = toReverse.length();

        String reversed = "";

        for (int i = 0; i < length; i++){ //You can't just concatenate! You have to make the loop go from back to front!

            reversed += toReverse.charAt(length - 1 - i); //append each character in the usedString to reversed using concatenation

        }

        return reversed; //What we will return to ThymeLeaf


        //Incorporate this POJO in JukeBox for now

    };

}
