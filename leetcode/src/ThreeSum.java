import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    //15. 3Sum

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if(i != j && i != k && j != k) {
                        if((nums[i] + nums[j] + nums[k]) == 0) {
                            result.add(List.of(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
