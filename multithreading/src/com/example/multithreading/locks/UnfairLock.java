package com.example.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Unfair lock mean it will not execute in order way
public class UnfairLock {

    private final Lock unfairLock = new ReentrantLock();

    private void executeTask() {
        unfairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        UnfairLock unfairLock = new UnfairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                unfairLock.executeTask();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
