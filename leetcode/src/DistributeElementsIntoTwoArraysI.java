import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistributeElementsIntoTwoArraysI {
    public static void main(String[] args) {
        System.out.println(resultArray(new int[]{2,1,3}));
    }

    public static int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                arr1.add(nums[i]);
                continue;
            } else if(i == 1) {
                arr2.add(nums[i]);
                continue;
            }

            if(arr1.getLast() > arr2.getLast()) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        arr1.addAll(arr2);

        return arr1.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
