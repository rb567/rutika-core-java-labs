package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    // Constructor
    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    // Getter and Setter
    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + this.toString());
    }

    @Override
    public void checkIn() {
        System.out.println("Journal Paper checked in: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Journal Paper checked out: " + getTitle());
    }
}
