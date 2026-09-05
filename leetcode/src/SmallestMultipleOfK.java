import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallestMultipleOfK {
    public static void main(String[] args) {
        SmallestMultipleOfK test = new SmallestMultipleOfK();
        System.out.println(test.missingMultiple(new int[]{1,4,7,10,15}, 5));
    }

    public int missingMultiple(int[] nums, int k) {
        boolean found = false;
        int i = 1;
        int multiple = 0;

        Set<Integer> set = new HashSet<>();
        for (int num: nums)
            set.add(num);

        while(!found) {
            multiple = k * i++;
            found = !set.contains(multiple);
        }

        return multiple;
    }
}
