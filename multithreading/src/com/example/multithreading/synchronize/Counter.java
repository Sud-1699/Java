package com.example.multithreading.synchronize;

public class Counter {
    private int count;

    // synchronized will lock the increment and tell other to wait once the current thread done with the task
    // If we will not use synchronized and multiple thread will simultaneous access the method which become race condition
    // Intrinsic Lock
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
