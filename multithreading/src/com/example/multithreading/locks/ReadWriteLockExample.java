package com.example.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    private void increase() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    private int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample example = new ReadWriteLockExample();

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    example.increase();
                    System.out.println(Thread.currentThread().getName() + " increased count");
                }
            }
        };

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " count: " + example.getCount());
                }
            }
        };

        Thread write = new Thread(writeTask);
        Thread read1 = new Thread(readTask);
        Thread read2 = new Thread(readTask);

        write.start();
        read1.start();
        read2.start();

        write.join();
        read1.join();
        read2.join();
    }
}
