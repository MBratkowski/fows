package com.fows.entity;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Presentation {

    private final List<Prelegent> prelegents;
    private final String theme;
    private final String information;
    private final String lang;
    private boolean isLiked;
    private float rating;

    //Zobaczymy w trakcie jaki najlepszy konstruktor będzie
    public Presentation(List<Prelegent> prelegents, String theme, String information, String lang) {
        this.prelegents = prelegents;
        this.theme = theme;
        this.information = information;
        this.lang = lang;
    }

    public List<Prelegent> getPrelegents() {
        return prelegents;
    }

    public String getTheme() {
        return theme;
    }

    public String getInformation() {
        return information;
    }

    public String getLang() {
        return lang;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public float getRating() {
        return rating;
    }
}
