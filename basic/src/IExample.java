public interface IExample {
    // public static property
    int property = 1;
    String property1 = "Hello";

    // public abstract method
    void method1(String value);
    int method2(int value);

    default int defaultMethod(String value) {
        return 0;
    }
}
