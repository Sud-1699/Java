package com.example.multithreading;

public class ThreadLifecycle extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Below program are running by main thread
        ThreadLifecycle lifecycle = new ThreadLifecycle();
        System.out.println(lifecycle.getState()); // New
        lifecycle.start();
        System.out.println(lifecycle.getState()); // RUNNABLE -> Either running or waiting for resource for running
        Thread.sleep(100); // Making main thread sleep for 100 millis second
        System.out.println(lifecycle.getState()); // TIMED_WAITING
        lifecycle.join(); // waiting for lifecycle thread to come back so that it will be terminated from main thread
        System.out.println(lifecycle.getState()); // TERMINATED

        // Print main thread state
        // System.out.println(Thread.currentThread().getState()); // RUNNABLE
    }
}
