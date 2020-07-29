package com.example.application1.dialerinfo;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Dell on 7/13/2020.
 */

public class ApplicationClass extends Application {
    public static ArrayList<Person> people;
    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList<Person>();
        people.add(new Person("Raj Bhalala","9998884443"));
        people.add(new Person("Jay Godhani","9099099000"));
        people.add(new Person("Bhushan Mainyar","5241234615"));

    }
}
