package com.fows.data.firebase.model;

import com.google.firebase.database.PropertyName;

/**
 * Created by mateuszbratkowski on 05.02.2017.
 */
public class PrelegentFirebaseModel {

    @PropertyName("first_name")
    String firstName;

    @PropertyName("last_name")
    String lastName;

    @PropertyName("id")
    int id;

    public PrelegentFirebaseModel() {
        //Here must be empty constructor for JSON deserialization by Firebase
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
