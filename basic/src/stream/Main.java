package stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Filter even number
        List<Integer> evenNumber = StreamQA.filterEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(evenNumber);

        // Find maximum number
        int maxNum = StreamQA.findMaximumNumber(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(maxNum);

        // Sort list in desc
        List<Integer> sortDesc = StreamQA.sortListInDesc(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(sortDesc);

        // Count string with start prefix
        int countStartPrefix = (int) StreamQA.countStringWithStartPrefix(Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie"), "A");
        System.out.println(countStartPrefix);
    }
}
