package com.example.p1coconuts;

import java.io.IOException;

public class CovidCases4 {
    int people = 2000;
    double maskers;
    double initCases;
    int days;
    int finalCases;

    public CovidCases4(int d){
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
        double exponent = Math.pow(2.72, calculationProportion);
        double exp = 1.0/3.0;
        double exp1 = Math.pow(exponent, exp);
        double doubleNumberOfDays = (double) days;
        double exponent1 = Math.pow(exp1, 2.0);
        double exponent2 = Math.pow(exponent1, doubleNumberOfDays);
        double rate = Math.pow(exp1, doubleNumberOfDays);
        double rate1 = rate * exponent2;
        System.out.println(rate);
        double newCases = rate1 * initCases;
        finalCases = (int)newCases;
        System.out.println(finalCases);

    }

    public int getFinalCases() throws IOException {
        setFinalCases();
        return finalCases;
    }

    public static int driver(int daysPast) throws IOException {
        CovidCases4 cases = new CovidCases4(daysPast);
        int y = cases.getFinalCases();
        return y;
    }

    public static void main(String[] args) throws IOException {
        //CovidCases case1 = new CovidCases(50);
        //case1.setFinalCases();
        System.out.println(CovidCases4.driver(25));

    }
}


