import java.util.ArrayList;
import java.util.Vector;
import java.util.List;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        System.out.println(vector);

//        List<Integer> results = new ArrayList<>(); // Both thread concurrently accessing shared resource results so race condition happening to prevent this we need to use synchronized method
        Vector<Integer> results = new Vector<>(); // Method are synchronized so one thread at time access shared resource but introduce performance overhead
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                results.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i< 1000; i++) {
                results.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();;
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(results.size()); // Actual o/p 2000
    }
}
