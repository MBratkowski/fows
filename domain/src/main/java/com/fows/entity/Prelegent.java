package com.fows.entity;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Prelegent {

    public static class Builder {

        private final int id;
        private final String name;
        private final String surname;

        private String company;
        private String urlPersonImage;
        private String urlCompanyImage;
        private String information;
        private List<Presentation> presentations;

        public Builder(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder personImage(String urlPersonImage) {
            this.urlPersonImage = urlPersonImage;
            return this;
        }

        public Builder companyImage(String urlCompanyImage) {
            this.urlCompanyImage = urlCompanyImage;
            return this;
        }

        public Builder information(String information) {
            this.information = information;
            return this;
        }

        public Builder presentations(List<Presentation> presentations) {
            this.presentations = presentations;
            return this;
        }

        public Prelegent build() {
            return new Prelegent(this);
        }
    }

    private int id;
    private String name;
    private String surname;
    private String company;
    private String urlPersonImage;
    private String urlCompanyImage;
    private String information;
    private List<Presentation> presentations;

    public Prelegent() {
    }

    public Prelegent(Builder builder) {
        id = builder.id;
        name = builder.name;
        surname = builder.surname;
        company = builder.company;
        urlCompanyImage = builder.urlCompanyImage;
        urlPersonImage = builder.urlPersonImage;
        information = builder.information;
        presentations = builder.presentations;
    }

    public Prelegent(int id, String name, String surname, String company, String urlPersonImage, String urlCompanyImage,
            String information) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.urlPersonImage = urlPersonImage;
        this.urlCompanyImage = urlCompanyImage;
        this.information = information;
        this.presentations = presentations;
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

    public String getUrlCompanyImage() {
        return urlCompanyImage;
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }
}
