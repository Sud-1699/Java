package com.example.multithreading;

public class InterruptedThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        thread.interrupt(); // 6th method of thread it interrupting the thread object to not wait or sleep
    }
}
