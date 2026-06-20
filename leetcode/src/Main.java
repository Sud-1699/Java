import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

        StringBuilder commonPrefix = new StringBuilder();

        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < strs.length; i++) {
                if(i == j) continue;

                String str1 = strs[i];
                String str2 = strs[j];

                str1.compareTo(str2);
            }
        }


        Map<Integer, Integer> map = new HashMap<>();
    }
}