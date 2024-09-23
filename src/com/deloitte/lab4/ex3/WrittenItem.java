package com.deloitte.lab4.ex3;

public abstract class WrittenItem extends Item {
    private String author;

    // Constructor
    public WrittenItem(String id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    // Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}
