import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubstringWithTwoOccurrences {
    public static void main(String[] args) {
        String s = "bcbbbcba";

        int l = 0, r = 0, max = 0;
        Map<Character, Integer> occurrences = new HashMap<>();

        while(r < s.length()) {
            occurrences.put(s.charAt(r), occurrences.getOrDefault(s.charAt(r), 0) + 1);

            while(occurrences.get(s.charAt(r)) > 2) {
                occurrences.put(s.charAt(l), occurrences.get(s.charAt(l)) - 1);
                l++;
            }

            r++;
            max = Math.max(max, r - l);
        }

        System.out.println(s.substring(l, r));
        System.out.println(max);
    }
}
