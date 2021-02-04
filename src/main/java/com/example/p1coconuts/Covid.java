package com.example.p1coconuts;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Covid {
    private @Id @GeneratedValue Long id;
    private String day;
    private String number;

    public Covid(){ }

    public Covid(String day, String number){
        this.day = day;
        this.number = number;

    }


    public Long getId() {
        return this.id;
    }
    public String getDay(){
        return day;
    }

    public String getNumber(){
        return number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDay(String name) {
        this.day = day;
    }

    public void setNumber(String role) {
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Covid))
            return false;
        Covid covid = (Covid) o;
        return Objects.equals(this.id, covid.id) && Objects.equals(this.day, covid.day)
                && Objects.equals(this.number, covid.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.day, this.day);
    }

    @Override
    public String toString() {
        return "Cases{" + "id=" + this.id + ", Day='" + this.day + '\'' + ", Number of Cases='" + this.number + '\'' + '}';
    }

}


