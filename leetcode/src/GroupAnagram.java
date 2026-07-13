import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Hashtable<String, List<String>> results = new Hashtable<>();

        for(int i = 0; i < strs.length; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            String reverse = sb.reverse().toString();
            if(results.containsKey(reverse)) {
                results.get(reverse).add(strs[i]);
            } else {
                List<String> s1 = new ArrayList<>();
                s1.add(strs[i]);
                results.put(reverse,s1);
            }
        }

        System.out.println(results.values().stream().toList());

        Map<StringBuilder, List<String>> result1 = Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> new StringBuilder(str).reverse()));

        System.out.println(result1.values().stream().toList());
    }
}
