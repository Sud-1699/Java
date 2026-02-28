package com.example.multithreading;

public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name); // Setting a name on Thread using Thread constructor
    }

    @Override
    public void run() {
        String concat = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10000; j++) {
                concat += "a";
            }

            System.out.println(
                    Thread.currentThread().getName() +
                    " Thread - priority: " + Thread.currentThread().getPriority() +
                    " count: " + i
            );
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        PriorityThread l = new PriorityThread("Low");
        PriorityThread m = new PriorityThread("Normal");
        PriorityThread h = new PriorityThread("High");
        l.setPriority(Thread.MIN_PRIORITY); // 5th method of thread
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
