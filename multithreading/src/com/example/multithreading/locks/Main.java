package com.example.multithreading.locks;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        // Create a anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdrawWithManualLock(30);
            }
        };

        Thread t1 = new Thread(task, "User 1");
        Thread t2 = new Thread(task, "User 2");

        t1.start();
        t2.start();
    }
}
