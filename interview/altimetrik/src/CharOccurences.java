import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CharOccurences {
    public static void main(String[] args) {
        String msg = "I am sudhanshu chaubey, I am from mumbai";

        // Need to find the third highest occurred character given string

        Map<Character, Long> collect = msg.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        long first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(Map.Entry<Character, Long> entry: collect.entrySet()) {
            if(first < entry.getValue()) {
                third = second;
                second = first;
                first = entry.getValue();
            } else if(second < entry.getValue()) {
                third = second;
                second = entry.getValue();
            } else if (third < entry.getValue()) {
                third = entry.getValue();
            }
        }

        System.out.println(third);
    }
}
