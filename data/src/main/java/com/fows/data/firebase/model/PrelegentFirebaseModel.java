package com.fows.data.firebase.model;

import com.google.firebase.database.PropertyName;

/**
 * Created by mateuszbratkowski on 05.02.2017.
 */
public class PrelegentFirebaseModel {

    @PropertyName("first_name")
    private String firstName;

    @PropertyName("last_name")
    private String lastName;

    public PrelegentFirebaseModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
