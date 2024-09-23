package com.deloitte.lab4.ex3;

public class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    // Constructor
    public Video(String id, String title, int copies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    // Getters and Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video: " + this.toString());
    }

    @Override
    public void checkIn() {
        System.out.println("Video checked in: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Video checked out: " + getTitle());
    }
}
