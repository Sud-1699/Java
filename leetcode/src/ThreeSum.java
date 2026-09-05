import java.util.*;

public class ThreeSum {
    //15. 3Sum

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};

        /*int l = 0, r = 1;
//        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        while(l < nums.length) {
            int sum = nums[l];
            List<Integer> threeSum = new ArrayList<>();
            threeSum.add(nums[l]);
            while(threeSum.size() < 3 && r < nums.length) {
                sum += nums[r];
                threeSum.add(nums[r]);
                r++;
            }

            if(sum == 0 && threeSum.size() == 3) {
                Collections.sort(threeSum);
                result.add(threeSum);
            }

            if(r >= nums.length - 1) {
                l++;
                r = l + 1;
            }
        }

        System.out.println(result);

        *//*Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        List<Integer> threeSum = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(threeSum);
                        result.add(threeSum);
                    }
                }
            }
        }*//*

        System.out.println(result.stream().toList());*/

        List<List<Integer>> result3 = new ArrayList<>();

        int i = 0, j = 1, k = 2;
        while(j <= nums.length || k <= nums.length) {
            if(j >= nums.length || k >= nums.length) {
                i++;
                j = i + 1;
                k = j + 1;
            }

            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0) {
                List<Integer> threeSum = Arrays.asList(nums[i], nums[j], nums[k]);
                Collections.sort(threeSum);
                result3.add(threeSum);
            }

            j++;
            k++;
        }

        System.out.println(result3);
    }
}
