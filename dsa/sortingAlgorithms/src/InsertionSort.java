import java.util.Arrays;

public class InsertionSort {
    // Time complexity O(n²)

    public static void main(String[] args) {
        int[] nums = new int[]{7, 4, 5, 3, 2};

        for(int i = 0; i < nums.length; i++) { // Iteration
            int temp = nums[i];
            int j = i;

            while(j > 0 && temp < nums[j - 1]) { // Compare and swap
                nums[j] = nums[j - 1];
                j = j - 1;
            }

            nums[j] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
