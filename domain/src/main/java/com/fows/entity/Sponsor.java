package com.fows.entity;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Sponsor {

    private final String name;
    private final String urlImage;
    private final String information;

    public Sponsor(String name, String urlImage, String information) {
        this.name = name;
        this.urlImage = urlImage;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getInformation() {
        return information;
    }
}
