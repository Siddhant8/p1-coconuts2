package com.example.p1coconuts;


import java.io.IOException;

public class CovidCases {
    int people = 2000;
    double maskers;
    double initCases;
    int days;
    int finalCases;

    public CovidCases(int d){
        this.people = people;
        this.maskers = maskers;
        this.initCases = initCases;
        this.days = d;
        this.finalCases = finalCases;
    }

    public int getPeople(){
        return people;
    }

    public void setMaskers(){
        getPeople();
        maskers = people/1.2;
    }

    public double getMaskers(){
        setMaskers();
        return maskers;
    }

    public void setInitCases(){
        initCases = 0.01*people;
    }

    public double getInitCases(){
        setInitCases();
        return initCases;
    }

    public int getDays(){
        return days;
    }

    public void setFinalCases() throws IOException {
        getPeople();
        getMaskers();
        getInitCases();
        getDays();

        double nonMaskWearers = people - maskers;
        double doubleNonMaskWearers = nonMaskWearers;
        System.out.println(nonMaskWearers);
        //double calculationProportion = 1/maskers;
        double calculationProportion = nonMaskWearers / people;
        //double dubNumMaskers = maskers;
        //double calculationProportion = dubNumMaskers/numPeople ;
        //double calculationProportion = 0.2;
        System.out.println(calculationProportion);
        System.out.println(days);
        double doubleNumberOfDays = (double) days;
        System.out.println(doubleNumberOfDays);
        double exponent = calculationProportion * doubleNumberOfDays;
        System.out.println(exponent);
        double rate = Math.pow(2.72, exponent);
        System.out.println(rate);
        double newCases = rate * initCases;
        finalCases = (int)newCases;
        System.out.println(finalCases);

    }

    public int getFinalCases() throws IOException {
        setFinalCases();
        return finalCases;
    }

    public static int driver(int daysPast) throws IOException {
        CovidCases cases = new CovidCases(daysPast);
        int y = cases.getFinalCases();
        return y;
    }

    public static void main(String[] args) throws IOException {
        //CovidCases case1 = new CovidCases(50);
        //case1.setFinalCases();
        System.out.println(CovidCases.driver(25));

    }



}
