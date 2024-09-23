package com.deloitte.lab4.ex3;

public class LibraryClient {

    public static void main(String[] args) {
        // Create instances of different library items
        Book book = new Book("B001", "Effective Java", 3, "Joshua Bloch");
        JournalPaper journal = new JournalPaper("J001", "Java Programming Journal", 5, "Jane Doe", 2022);
        Video video = new Video("V001", "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD("C001", "Dark Side of the Moon", 4, 43, "Pink Floyd", "Rock");

        // Print details of each item
        book.print();
        journal.print();
        video.print();
        cd.print();

        // Check-in and check-out actions
        book.checkIn();
        book.checkOut();
        journal.checkIn();
        journal.checkOut();
        video.checkIn();
        video.checkOut();
        cd.checkIn();
        cd.checkOut();
    }
}
