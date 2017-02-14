package com.fows.entity;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Prelegent {

    private int id;
    private String name;
    private String surname;
    private String company;
    private String urlPersonImage;
    private String information;
    private List<Presentation> presentations;

    public Prelegent() {
        //Here is the empty constructor
    }

    public Prelegent(int id, String name, String surname, String urlPersonImage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.urlPersonImage = urlPersonImage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public String getInformation() {
        return information;
    }

    public String getUrlPersonImage() {
        return urlPersonImage;
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }
}
