package com.example.multithreading;

public class ThreadMethod extends Thread {

    @Override
    public void run() { // 2nd method which an exposure ridden method where your actual work done
        System.out.println("Running thread 2nd method");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000); // thread 3rd method
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethod method = new ThreadMethod();
        method.start(); // 1st method of thread to initiate run method
        method.join(); // 4th method of thread where main thread is waiting for method thread to return once his work done and terminated
        System.out.println("Main Thread: Hello finally method thread task is done");
    }
}
