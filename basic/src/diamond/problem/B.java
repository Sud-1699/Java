package diamond.problem;

public interface B {
    default void test() {
        System.out.println("Call from B");
    }
}
