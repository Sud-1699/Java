import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMIV";
        int result = 0;

        Map<Character, Integer> dictionary = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        for(int i = 0; i < roman.length(); i++) {
            if(i + 1 < roman.length() && dictionary.get(roman.charAt(i)) < dictionary.get(roman.charAt(i + 1))) {
                result += dictionary.get(roman.charAt(i + 1)) - dictionary.get(roman.charAt(i));
                i++;
            } else {
                result += dictionary.get(roman.charAt(i));
            }
        }

        System.out.println(result);
    }
}
