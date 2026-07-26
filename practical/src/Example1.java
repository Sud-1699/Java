import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        // take string and print number of occurences of each character
        String s = "sudhanshu";

        Map<Character, Integer> result = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0) + 1);
        }

        /*Map<Character, Long> result =  s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));*/


        for(Map.Entry<Character, Integer> entry: result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Accept List of integer 1, 2, 3, 4, 7, 6, 5,  target = 7 print the pair of two number which sum of the target number
        int[] nums = {1, 2, 3, 4, 7, 6, 5};
        int target = 7;

        Set<Integer> dict = new HashSet<>();
        for(int i =0; i< nums.length; i++) {
            int comp = target - nums[i];
            if(dict.contains(comp)) {
                System.out.println(List.of(comp, nums[i]));
            }

            dict.add(nums[i]);
        }

        // start.spring.io
        /*
        * - Rest web appplication
        *   - spring web dep
        *   - spring data jpa
        *   - java version 21
        *   - build maven
        * */

        // postgresql -> connection pool
        /*
        * DB is up or not
        * port number
        * url config mismatch in application.properties
        * */

        // how many component
        // Emp enities
        // dep entities
        // employee id in dep as foreign key
        /*
                select dept.name, count(emp.*)
                from department dept, employee emp
                full join emp.dept_id = dept.id
                groupBy dept.name
                */
    }
}
