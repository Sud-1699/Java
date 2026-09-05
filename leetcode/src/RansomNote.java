import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(new RansomNote().canConstructV2("bcb", "cjjajdfaaeegig"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == magazine.length()) return ransomNote.equals(magazine);

        StringBuilder result = new StringBuilder();
        for(char c: magazine.toCharArray()) {
            if(ransomNote.equals(result.toString())) {
                return true;
            }

            result.append(c);
        }

        return false;
    }

    public boolean canConstructV2(String ransomNote, String magazine) {
        Map<Character, Integer> construct = new HashMap<>();
        for(char c: ransomNote.toCharArray()) {
            construct.put(c, construct.getOrDefault(c, 0) + 1);
        }

        for(char c: magazine.toCharArray()) {
            if(!construct.containsKey(c))
                continue;

            construct.put(c, construct.getOrDefault(c, 0) - 1);
        }

        int canConstruct = 0;
        for(Map.Entry<Character, Integer> entry: construct.entrySet()) {
            if(entry.getValue() > 0)
                canConstruct++;
        }

        return canConstruct == 0;
    }
}
