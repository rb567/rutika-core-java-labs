package com.deloitte.lab4.ex3;

public abstract class MediaItem extends Item {
    private int runtime;

    // Constructor
    public MediaItem(String id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    // Getter and Setter
    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }
}
