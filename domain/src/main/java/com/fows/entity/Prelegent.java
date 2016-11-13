package com.fows.entity;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Prelegent {

    private int id;

    private String name;

    private String surname;

    private String company;

    private String urlPersonImage;

    private String urlCompanyImage;

    private String information;

    public Prelegent(String name, String surname, String company, String urlPersonImage, String urlCompanyImage, String information) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.urlPersonImage = urlPersonImage;
        this.urlCompanyImage = urlCompanyImage;
        this.information = information;
    }

    public int getId() {
        return this.id;
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

    public String getUrlCompanyImage() {
        return urlCompanyImage;
    }
}
