package com.fows.entity;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Prelegent {

    public static class Builder {

        private int id;

        private String name;

        private String surname;

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

    public Prelegent(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.company = builder.company;
        this.urlCompanyImage = builder.urlCompanyImage;
        this.urlPersonImage = builder.urlPersonImage;
        this.information = builder.information;
        this.presentations = builder.presentations;
    }


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

    public List<Presentation> getPresentations() {
        return presentations;
    }
}
