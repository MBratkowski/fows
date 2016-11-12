package com.fows.entiti;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Sponsor {
    private String name;
    private String urlImage;
    private String information;

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
