import java.util.ArrayList;
import java.util.List;

public class GreaterElementFromRight {
    public static void main(String[] args) {
        int[] nums = {17, 5, 13, 8, 16, 1, 2};
        List<Integer> result = new ArrayList<>();

        int l = 0;
        int h = 1;

        while(l <= h) {
            if(nums[l] > nums[h]) {
                result.add(nums[l]);
                l++;
                h++;
            }
        }
    }
}
