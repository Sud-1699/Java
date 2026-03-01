package com.example.multithreading.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    // Using Automatic Lock now we will use manual lock
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount: " + amount);
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding to withdrawal");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Withdrawal successful. Remaining balance: " + balance);

        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }

    private final Lock lock = new ReentrantLock();

    public void withdrawWithManualLock(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount: " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if(balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding to withdrawal");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " Withdrawal successful. Remaining balance: " + balance);

                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock, will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
