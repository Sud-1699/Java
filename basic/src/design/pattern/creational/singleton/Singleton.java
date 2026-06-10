package design.pattern.creational.singleton;

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

    public static void main(String[] args) {
        // Singleton design principle using core java
        Singleton z = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton x = Singleton.getInstance();

        System.out.println(x.add(20, 10));
        System.out.println(y.add(20, 50));
        System.out.println(z.add(230, 10));
    }
}
