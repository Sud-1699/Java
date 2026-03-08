import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /*// Functional Interface example
        Calculator add = new Calculator() {
            @Override
            public int calculate(int n1, int n2) {
                return n1 + n2;
            }
        };

        System.out.println("Calculator function interface in traditional way: " + add.calculate(5, 10));

        Calculator add1 = (n1, n2) -> n1 + n2;
        Calculator mul = (n1, n2) -> n1 * n2;
        System.out.println(mul.multiple(23, 44));
        System.out.println("Calculator function interface using lambda: " + add1.calculate(10, 10));

        // Singleton design principle using core java
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println(x.add(20, 10));
        System.out.println(y.add(20, 50));
        System.out.println(z.add(230, 10));

        Example1.Example2 example2 = new Example1.Example2();

        nonRepeated("swiss");*/
        System.out.println(findLargestOddSubstring("987654321"));
        List<Integer> numbers = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, -4);
        System.out.println(Stream.concat(numbers.stream().filter(n -> n != 0), numbers.stream().filter(n -> n == 0)).toList());
    }

    public static void nonRepeated(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(charCount.containsKey(c)) {
                int newCount = charCount.get(c) + 1;
                charCount.replace(c, newCount);
            } else {
                charCount.put(c, 1);
            }
        }

        char nonRepeatedChar = 0;
        for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {
            if(entry.getValue() == 1) {
                nonRepeatedChar = entry.getKey();
                break;
            }
        }

        System.out.println(nonRepeatedChar);
    }

    public static String findLargestOddSubstring(String num) {
        //write your code here...
        int start = 0;
        int end = 1;
        int longestIndex = 0;

        int lastNumber = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));
        if(lastNumber % 2 == 1) {
            longestIndex = num.length();
        } else {
            while(end <= (num.length() - 1)) {
                int number = Integer.parseInt(num.substring(start, end));
                if(number % 2 != 0) {
                    longestIndex = end;
                }
                start++;
                end++;
            }
        }

        String longestOddSubstring = num.substring(0, longestIndex);
        return !longestOddSubstring.isEmpty() ? longestOddSubstring : "-1";
    }
}
