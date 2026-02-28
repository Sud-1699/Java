package com.example.multithreading;

public class DaemonThread extends Thread {

    public DaemonThread() {}

    public DaemonThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Running !");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread(); // User Thread
        t1.setDaemon(true); // Daemon thread that run on background and JVM ignore this one
        t1.start();
        System.out.println("Main Thread Done");
    }
}
