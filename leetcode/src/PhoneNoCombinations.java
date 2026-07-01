import java.util.List;
import java.util.Map;

public class PhoneNoCombinations {
    public static void main(String[] args) {
        Map<Character, List<String>> phones = Map.of(
                '2', List.of("a", "b", "c"),
                '3', List.of("d", "e", "f"),
                '4', List.of("g", "h", "i"),
                '5', List.of("j", "k", "l"),
                '6', List.of("m", "n", "o"),
                '7', List.of("p", "q", "r", "s"),
                '8', List.of("t", "u", "v"),
                '9', List.of("w", "x", "y", "z")
        );

        String digits = "29";

        for (char c : digits.toCharArray()) {
            
        }
    }
}