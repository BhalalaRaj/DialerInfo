package com.example.application1.dialerinfo;

/**
 * Created by Dell on 7/12/2020.
 */

public class Person {
    private String name;
    private String telnr;

    public Person(String name, String telnr) {
        this.name = name;
        this.telnr = telnr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelnr() {
        return telnr;
    }

    public void setTelnr(String telnr) {
        this.telnr = telnr;
    }
}
