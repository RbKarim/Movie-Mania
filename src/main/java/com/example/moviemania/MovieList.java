package com.example.moviemania;

public class MovieList {
    private String title;
    private String description;
    private int thumbnail;
    private String rating;
    private String studio;
    private String streamingLink;

    public MovieList(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public MovieList(String title, String description, int thumbnail, String rating, String studio, String streamingLink) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.rating = rating;
        this.studio = studio;
        this.streamingLink = streamingLink;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {

        this.thumbnail = thumbnail;
    }

    public String getRating() {

        return rating;
    }

    public void setRating(String rating) {

        this.rating = rating;
    }

    public String getStudio() {

        return studio;
    }

    public void setStudio(String studio) {

        this.studio = studio;
    }

    public String getStreamingLink() {

        return streamingLink;
    }

    public void setStreamingLink(String streamingLink) {

        this.streamingLink = streamingLink;
    }
}
