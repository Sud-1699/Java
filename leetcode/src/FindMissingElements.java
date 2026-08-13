import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {
    public static void main(String[] args) {
        int[] nums = {5, 1};
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int counter = nums[0];
        for(int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            result.add(i);
        }

        System.out.println(result);
    }
}
