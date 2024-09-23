package com.deloitte.lab4.ex3;

public abstract class Item {
    private String id;
    private String title;
    private int copies;

    // Constructor
    public Item(String id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    // Abstract methods
    public abstract void print();
    public abstract void checkIn();
    public abstract void checkOut();

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + copies;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
