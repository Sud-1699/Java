package com.example.multithreading.locks;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen "  + this + " and trying to write");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper "  + this + " and trying to write");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }


    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread 1 locks pen and trying to lock paper
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }


    @Override
    public void run() {
        synchronized (pen) { // Using synchronized to prevent deadlock to acquire pen lock
            paper.writeWithPaperAndPen(pen); // thread 2 locks paper and trying to lock pen
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "Thread 1");
        Thread t2 = new Thread(new Task2(pen, paper), "Thread 2");

        t1.start();
        t2.start();
    }
}
