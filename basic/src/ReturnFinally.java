import java.util.Arrays;
import java.util.List;

public class ReturnFinally {
    public static int testMethod() {
        try {
            return 100; // Program tries to return here
        } finally {
            System.out.println("Finally runs before the return completes!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Method returned: " + testMethod());

        List<Integer> salarys = Arrays.asList(10, 100, 3000, 5, 40);

        int maxSalary = salarys.stream()
                .mapToInt(Integer::intValue)
                .max().orElse(0);

        System.out.println("Maximum salary is: " + maxSalary);
    }
}