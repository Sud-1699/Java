package com.example.multithreading;

// 2 ways to create a threads
// using extends to thread class
// or implements the runnable interface
public class World extends Thread {

    @Override
    public void run() {
        for (; ;) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
