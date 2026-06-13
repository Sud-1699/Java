import java.util.Arrays;

public class SelectionSort {

    // Time complexity O(n^2)

    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 5, 3, 9, 4, 1};

        for(int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }

            if(min != i) {
                nums[i] = nums[i] ^ nums[min];
                nums[min] = nums[i] ^ nums[min];
                nums[i] = nums[i] ^ nums[min];
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
