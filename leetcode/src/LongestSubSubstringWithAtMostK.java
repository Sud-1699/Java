import java.util.HashMap;
import java.util.Map;

public class LongestSubSubstringWithAtMostK {
    public static void main(String[] args) {
        int k = 2;
        String s  = "ababbc";

        Map<Character, Integer> frequency = new HashMap<>();
        int r = 0;
        while(r < s.length()) {
            frequency.put(s.charAt(r), frequency.getOrDefault(s.charAt(r), 0) + 1);

            if(frequency.get(s.charAt(r)) >= k) {
                break;
            }
            r++;
        }

        System.out.println(frequency);
        System.out.println(r);
    }
}
