package com.example.multithreading;

public class RunnableThread implements Runnable{

    @Override
    public void run() {
        for(; ;) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
