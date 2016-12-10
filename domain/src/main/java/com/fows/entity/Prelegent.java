package com.fows.entity;

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

        public Prelegent build() {
            return new Prelegent(this);
        }
    }

    private final int id;
    private final String name;
    private final String surname;
    private final String company;
    private final String urlPersonImage;
    private final String urlCompanyImage;
    private final String information;

    public Prelegent(Builder builder) {
        id = builder.id;
        name = builder.name;
        surname = builder.surname;
        company = builder.company;
        urlCompanyImage = builder.urlCompanyImage;
        urlPersonImage = builder.urlPersonImage;
        information = builder.information;
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
