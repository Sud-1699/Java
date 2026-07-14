import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> results = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sort = Arrays.toString(chars);
            if(results.containsKey(sort)) {
                results.get(sort).add(strs[i]);
            } else {
                List<String> s1 = new ArrayList<>();
                s1.add(strs[i]);
                results.put(sort,s1);
            }
        }

        System.out.println(results.values().stream().toList());
    }
}
