package com.fows.entiti;

import java.util.Date;
import java.util.List;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Presentation {
    private List<Prelegent> prelegents;
    private String theme;
    private String information;
    private Date startTime;
    private Date finishTime;

    //Zobaczymy w trakcie jaki najlepszy konstruktor będzie
    public Presentation(List<Prelegent> prelegents, String theme, String information, Date startTime, Date finishTime) {
        this.prelegents = prelegents;
        this.theme = theme;
        this.information = information;
        this.startTime = startTime;
        this.finishTime = finishTime;
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

    public int getHourStart(){
        return startTime.getHours();
    }

    public int getMinuteStart(){
        return startTime.getMinutes();
    }

    public int getHourTime(){
        return finishTime.getHours();
    }

    public int getMinuteTime(){
        return finishTime.getMinutes();
    }

    public int getDay(){
        return startTime.getDay();
    }
}
