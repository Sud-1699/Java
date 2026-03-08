package stream;

import java.util.*;

public class Reduce {

    public static void main(String[] args) {

    }

    private void fourth() {
//        Java 8 Stream API - 04 Find the 2nd highest length word in the given sentence
        String s = "I am learning streams API in java";

        String result = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(result.length());
    }

    private void third() {
//        Java 8 Stream API - 03 Find the 2nd highest word in the given sentence
        String s = "I am learning streams API in java";

        String result = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(result);
    }

    private void second() {
//        Java 8 Stream API - 02 Remove duplicates from the string and return in the same order
        String s = "dabcadefg";
        Set<Character> uniques = new HashSet<>();
        s.chars().distinct().mapToObj(c -> (char) c)
                .forEach(System.out::print);
    }

    private void first() {
//        Java 8 Stream API - 01 Find the word that have the highest length
        String s = "I am learning streams API in java";

        String result =  Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get();
                /*.reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .orElseThrow();*/
        System.out.println(result);
    }
}
