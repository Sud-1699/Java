import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagram ga = new GroupAnagram();
        System.out.println(ga.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = Arrays.stream(strs)
        .collect(Collectors.groupingBy(
                word -> word.chars().sorted()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
        ));

        return anagrams.values().stream().toList();
    }
}
