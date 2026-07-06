class Parent1 {
    static int x=10;
    static void staticMethod() { // Static method are hidden from other classes
        x++;
        System.out.println("Value of X in Parent : " + x);
    }
}

class Child1 extends Parent1 {
    static void staticMethod() { // Static method are hidden from other classes
        x++;
        System.out.println("Value of X in Child : " + x);
    }
}

public class StaticMethodTest {
    public static void main(String[] args) {
        Parent1.staticMethod(); // Value of X in Parent : 11
        Child1.staticMethod(); // Value of X in Child : 12 (super) // Error throw
        Parent1 parent = new Child1();
        parent.staticMethod(); // Compile time error
    }
}