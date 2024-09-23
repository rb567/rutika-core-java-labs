package com.deloitte.lab9.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Task class implementing Runnable interface
class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is starting.");
        try {
            // Simulate task execution with sleep
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println(taskName + " is completed.");
    }
}

public class Lab9Ex7 {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create and submit tasks
        executorService.submit(new Task("Task 1"));
        executorService.submit(new Task("Task 2"));
        executorService.submit(new Task("Task 3"));
        executorService.submit(new Task("Task 4"));
        executorService.submit(new Task("Task 5"));

        // Initiate an orderly shutdown of the executor service
        executorService.shutdown();
        try {
            // Wait for existing tasks to terminate
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                // Force shutdown if tasks did not terminate in the given time
                executorService.shutdownNow();
                // Wait again for tasks to respond to being cancelled
                if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                    System.err.println("ExecutorService did not terminate.");
                }
            }
        } catch (InterruptedException e) {
            // (Re-)Cancel if current thread also interrupted
            executorService.shutdownNow();
            // Preserve interrupt status
            Thread.currentThread().interrupt();
        }
    }
}
