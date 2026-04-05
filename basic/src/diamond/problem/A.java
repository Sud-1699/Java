package diamond.problem;

public interface A {
    default void test() {
        System.out.println("Call from A");
    }
}
