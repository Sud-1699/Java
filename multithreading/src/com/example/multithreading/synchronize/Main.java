package com.example.multithreading.synchronize;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        // Both thread will not return 2000 count cuz both are starting from 0 itself
        // cuz both thread t1 and t2 sharing same object counter
        // To achieve this will make increment method a synchronized or synchronized function of current object itself
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }

        System.out.println(counter.getCount());
    }
}
