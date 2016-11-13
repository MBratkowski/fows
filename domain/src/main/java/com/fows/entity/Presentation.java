package com.fows.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Presentation {

    private ArrayList<Prelegent> prelegents;

    private String theme;

    private String information;

    private Date startTime;

    private Date finishTime;

    private String lang;

    private boolean isLiked;

    private float rating;

    //Zobaczymy w trakcie jaki najlepszy konstruktor będzie
    public Presentation(ArrayList<Prelegent> prelegents, String theme, String information, Date startTime, Date finishTime, String lang) {
        this.prelegents = prelegents;
        this.theme = theme;
        this.information = information;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.lang = lang;
    }

    public ArrayList<Prelegent> getPrelegents() {
        return prelegents;
    }

    public String getTheme() {
        return theme;
    }

    public String getInformation() {
        return information;
    }

    public int getHourStart() {
        return startTime.getHours();
    }

    public int getMinuteStart() {
        return startTime.getMinutes();
    }

    public int getHourTime() {
        return finishTime.getHours();
    }

    public int getMinuteTime() {
        return finishTime.getMinutes();
    }

    public int getDay() {
        return startTime.getDay();
    }

    public String getLang() {
        return lang;
    }
}
