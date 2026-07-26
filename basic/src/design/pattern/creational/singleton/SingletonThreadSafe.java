package design.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class SingletonThreadSafe {
    private AtomicInteger counter = new AtomicInteger(0);
    private volatile static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
        System.out.println("Instance creation count: " + counter.incrementAndGet());
    }

    public static SingletonThreadSafe getInstance() {
        if(instance == null) {
            synchronized(SingletonThreadSafe.class) {
                if(instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }

        return instance;
    }

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> SingletonThreadSafe.getInstance().add(10, 32));

        Thread thread2 = new Thread(() -> SingletonThreadSafe.getInstance().add(30, 100));

        thread1.start();
        thread2.start();
    }
}
