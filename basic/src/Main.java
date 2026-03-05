import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Functional Interface example
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

        nonRepeated("swiss");
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
}
