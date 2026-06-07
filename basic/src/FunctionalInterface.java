public class FunctionalInterface {
    @java.lang.FunctionalInterface
    public interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Calculator add = (int a, int b) -> a+ b;
        add.calculate(23, 22);
    }
}
