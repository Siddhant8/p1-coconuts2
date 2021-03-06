package com.example.p1coconuts;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Covid {
    private @Id @GeneratedValue Long id;
    private String age;
    private int number;


    public Covid(){ }

    public Covid(String agePerson, int numberCase){
        this.age = agePerson;
        this.number = numberCase;

    }

    //getters and setters for each variable
    public Long getId() {
        return this.id;
    }
    public String getAge(){
        return age;
    }

    public int getNumber(){
        return number;
    }

    public void setId(Long id1) {
        this.id = id1;
    }

    public void setAge(String age1) {
        this.age = age1;
    }

    public void setNumber(int number1) {
        this.number = number1;
    }


    @Override
    public String toString() {
        return "Cases{" + "Age='" + this.age + '\'' + ", Number of Cases='" + this.number + '\'' + '}' + '\n';

    }

}


