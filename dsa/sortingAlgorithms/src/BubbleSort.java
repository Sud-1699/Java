import java.util.Arrays;

public class BubbleSort {
    //Bubble Sort is not suited for large datasets as it has a worst-case and average time complexity of O(n²),
    // where n is the number of items being sorted.

    public static void main(String[] args) {
        int[] nums = new int[]{8, 7, 5, 3, 2};

        int flag = 0; // If arrays already sorted so no need to loop average time complexity is O(n)
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] ^ nums[j + 1];
                    nums[j + 1] = nums[j] ^ nums[j + 1];
                    nums[j] = nums[j] ^ nums[j + 1];

                    flag = 1;
                }
            }

            if(flag == 0) break;
        }

        System.out.println(Arrays.toString(nums));
    }
}