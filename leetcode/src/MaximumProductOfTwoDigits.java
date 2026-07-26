import java.util.ArrayList;
import java.util.List;

public class MaximumProductOfTwoDigits {
    // 3536

    public static void main(String[] args) {
        int n = 31;

        List<Integer> digits = new ArrayList<>();
        while(n > 0) {
            int digit = n % 10;
            digits.add(digit);

            n = n / 10;
            digits.add(n);
        }

        System.out.println(digits);
    }
}
