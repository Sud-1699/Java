import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        String s = "sudhanshu";
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> nonVowelsString = s.chars().mapToObj(c -> (char) c)
                .filter(c -> !vowels.contains(c))
                .toList();

        System.out.println(nonVowelsString.toString());

        Map<Character, Long> acc =  s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(acc);

        String word = "I am a java developer and I am proud of it ";
        Map<String, Long> accWord =  Arrays.stream(word.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(accWord);

        System.out.println(vowels.stream()
                .sorted(Comparator.reverseOrder())
                .toList());

        String s1 = "tet";
        System.out.println(s1.equals(new StringBuilder(s1).reverse().toString()));

        List<String> ss = Arrays.asList("tet", "tesss", "madam", "121", "hello");
        System.out.println((ss.stream()
                .filter(e -> e.equals(new StringBuilder(e).reverse().toString()))
                .toList()));

        swapNumber(59, 20);
        swapString("abce", "def");
    }

    private static void swapNumber(int a, int b) {
        System.out.println("Before swap a: " + a + " b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap a: " + a + " b: " + b);
    }

    private static void swapString(String a, String b) {
        System.out.println("Before swap a: " + a + " b: " + b);

        a = a.concat(b);
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swap a: " + a + " b: " + b);
        
    }
}
