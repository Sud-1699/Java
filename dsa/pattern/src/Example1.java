import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Example1 {
    public static void main(String[] args) {
        String[] anagram = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> grouped = new HashMap<>();
        for(String s: anagram) {
            String sorted = sorted(s);

            if(!grouped.containsKey(sorted)) {
                grouped.put(sorted, Arrays.asList(s));
            } else {
                grouped.get(sorted).add(s);
            }
        }

        System.out.println(grouped.values());
    }

    public static String sorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}