package com.example.p1coconuts;

import java.util.Objects;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Covid {
    private @Id @GeneratedValue Long id;
    private String age;
    private int number;


    public Covid(){ }

    public Covid(String age, int number){
        this.age = age;
        this.number = number;

    }


    public Long getId() {
        return this.id;
    }
    public String getAge(){
        return age;
    }

    public int getNumber(){
        return number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(String age1) {
        this.age = age1;
    }

    public void setNumber(int role) {
        this.number = number;
    }


    /*@Override
    public boolean equals(Object object) {

        Covid covid = (Covid) object;
        return Objects.equals(this.id, covid.id) && Objects.equals(this.age, covid.age)
                && Objects.equals(this.number, covid.number);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.age, this.age);
    }

    @Override
    public String toString() {
        return "Cases{" + "Age='" + this.age + '\'' + ", Number of Cases='" + this.number + '\'' + '}' + '\n';

    }

}


