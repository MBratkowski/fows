package com.fows.entity;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class Presentation {
    public static class Builder {

        private final String author;
        private final String theme;
        private final String startTime;
        private String description;
        private boolean isLiked;
        private float rating;

        public Builder(String theme, String author, String startTime) {
            this.theme = theme;
            this.author = author;
            this.startTime = startTime;
        }

        public Presentation build() {
            return new Presentation(this);
        }
    }

    private String author;
    private String theme;
    private String description;
    private String startTime;
    private boolean isLiked;
    private float rating;

    public Presentation(Builder builder) {
        author = builder.author;
        theme = builder.theme;
        description = builder.description;
        startTime = builder.startTime;
        rating = builder.rating;
    }

    public Presentation(String theme, String description, String startTime, boolean isLiked, float rating) {
        this.theme = theme;
        this.description = description;
        this.startTime = startTime;
        this.isLiked = isLiked;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getTheme() {
        return theme;
    }

    public String getDescription() {
        return description;
    }

    public String getStartTime() {
        return startTime;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public float getRating() {
        return rating;
    }
}
