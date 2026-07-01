import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiThreadHandle {
    static int var = 5;
    public synchronized void test1() {
        var++;
        System.out.println("Inside Test1 Method : " + var);
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void test2() {
        var++;
        System.out.println("Inside Test2 Method : " + var);
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String args[]) {
        MultiThreadHandle obj =  new MultiThreadHandle();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable runnableTask1 = () -> { obj.test1(); };
        Runnable runnableTask2 = () -> { obj.test2(); }; // Throw error compile time

        executor.execute(runnableTask1);
        executor.execute(runnableTask2);
    }
}