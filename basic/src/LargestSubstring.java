import java.util.HashMap;
import java.util.Map;

public class LargestSubstring {

    public static void main(String[] args) {
        Map<Character, Character> subStringMap = new HashMap<>();
        String s = "aaaaa";

        for(int i = 0; i < s.length(); i++) {
            char substring = s.charAt(i);
            if(!subStringMap.containsKey(substring)) {
                subStringMap.put(substring, substring);
            }
        }

        System.out.println(subStringMap.size());
    }
}
