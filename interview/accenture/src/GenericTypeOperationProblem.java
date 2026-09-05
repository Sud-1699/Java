import java.util.Objects;

interface DateType<T> {
    void addition(T a, T b);
    void subtraction(T a, T b);
    void multiplication(T a, T b);
    void division(T a, T b);
}

// implement a generic class StringDataType<T> that implements the DataType<T> interface
class StringDataType<T> implements DateType<T> {
    @Override
    public void addition(T a, T b) {
        System.out.println("Addition: " + a.toString() + b.toString());
    }

    @Override
    public void subtraction(T a, T b) {

    }

    @Override
    public void multiplication(T a, T b) {

    }

    @Override
    public void division(T a, T b) {

    }
}

// implement a generic class NumericDataType<T> that implements the DataType<T> interface
class NumericDataType<T extends Number> implements DateType<T> {
    @Override
    public void addition(T a, T b) {
        System.out.printf("Addition: %.2f%n", a.doubleValue() + b.doubleValue());
    }

    @Override
    public void subtraction(T a, T b) {

    }

    @Override
    public void multiplication(T a, T b) {

    }

    @Override
    public void division(T a, T b) {

    }
}

public class GenericTypeOperationProblem {
    public static void main(String[] args) {
//        StringDataType<String> obj1 = new StringDataType<>();
        NumericDataType<Integer> obj1 = new NumericDataType<>();
        obj1.addition(10,23);
    }
}
