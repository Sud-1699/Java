
// Singleton design principle using core java
public class Singleton {

    private static int count;
    private static Singleton instance;

    public Singleton() {
        count++;
        System.out.println("Singleton instance count: " + count);
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
