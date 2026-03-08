package stream;

import java.util.Comparator;
import java.util.List;

public class StreamQA {
    /*
    * 1. Filter Even Numbers from a List
    * Question: Given a list of integers, filter the even numbers.
    * */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }

    /*
    * 2. Find Maximum in a List
    * Question: Find the maximum number from a list of integers.
    * */
    public static int findMaximumNumber(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .max().orElse(0);
    }

    /*
    * 3. Sort a List
    * Question: Sort a list of integers in descending order.
    * */
    public static List<Integer> sortListInDesc(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    /*
    * 4. Count Strings with Specific Prefix
    * Question: Count strings starting with a specific prefix, e.g., “A”.
    * */
    public static long countStringWithStartPrefix(List<String> strings, String prefix) {
        return strings.stream()
                .filter(string -> string.startsWith(prefix))
                .count();
    }
}
