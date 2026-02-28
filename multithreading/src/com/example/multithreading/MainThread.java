package com.example.multithreading;

public class MainThread {

    public static void main(String[] args) {
        //Below example of World class extends with thread class
        World world = new World();  // New State
//        world.start(); // To initiate the new thread // Runnable State

        //Below example of thread class implement Runnable interface
        RunnableThread runnableThread = new RunnableThread();
        // To start the thread we need to create thread object
        Thread t1 = new Thread(runnableThread);
        t1.start();

        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
//        System.out.println("Working with multithreading");
    }
}
