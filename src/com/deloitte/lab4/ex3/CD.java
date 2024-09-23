package com.deloitte.lab4.ex3;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    // Constructor
    public CD(String id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    // Getters and Setters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + this.toString());
    }

    @Override
    public void checkIn() {
        System.out.println("CD checked in: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("CD checked out: " + getTitle());
    }
}
