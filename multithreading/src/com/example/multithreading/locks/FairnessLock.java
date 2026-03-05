package com.example.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//fair lock mean it will execute in order way
public class FairnessLock {

    private final Lock fairnessLock = new ReentrantLock(true);

    private void executeTask() {
        fairnessLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            fairnessLock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLock fairnessLock = new FairnessLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairnessLock.executeTask();
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
