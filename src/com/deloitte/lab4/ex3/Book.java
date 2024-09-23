package com.deloitte.lab4.ex3;

public class Book extends WrittenItem {

    // Constructor
    public Book(String id, String title, int copies, String author) {
        super(id, title, copies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.toString());
    }

    @Override
    public void checkIn() {
        System.out.println("Book checked in: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Book checked out: " + getTitle());
    }
}
