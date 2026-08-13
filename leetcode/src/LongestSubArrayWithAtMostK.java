import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithAtMostK {
    public static void main(String[] args) {
        int k = 1;
        int[] nums = {2, 2, 3};

        Map<Integer, Integer> frequency = new HashMap<>();
        int ans = 0, l = -1, r = 0;
        while(r < nums.length) {
            frequency.put(nums[r], frequency.getOrDefault(nums[r], 0) + 1);

            while(frequency.get(nums[r]) > k) {
                l++;
                frequency.put(nums[l], frequency.get(nums[l]) - 1);
            }

            ans = Math.max(ans, r - l);
            r++;
        }

        System.out.println(ans);
    }
}
