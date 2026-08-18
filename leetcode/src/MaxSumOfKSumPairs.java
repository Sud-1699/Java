import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MaxSumOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;

        Map<Integer, List<Integer>> mapSet = new HashMap<>();

        for(int i = 0; i < nums.length; i++)  {
            int comp = k - nums[i];
            if(mapSet.containsKey(comp)) {
                mapSet.put(nums[i], List.of(comp, nums[i]));
            }

            mapSet.put(nums[i], List.of(comp, nums[i]));
        }

        System.out.println(mapSet);
        System.out.println(mapSet.size());
    }
}
