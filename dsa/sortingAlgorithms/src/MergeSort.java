import java.util.Arrays;

public class MergeSort {
    // Time complexity O(n log n)
    // Good for large data set due to stability
    public static void main(String[] args) {
        int[] nums = new int[]{7, 3, 2, 16, 24, 4, 11, 9};

        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums) {
        if(nums.length > 1) {
            // Divide the array into two halves
            int mid = nums.length / 2;

            // Copy the halves into left and right
            int[] left = Arrays.copyOfRange(nums, 0, mid);
            int[] right = Arrays.copyOfRange(nums, mid, nums.length);

            // Recursively sort the left and right halves
            mergeSort(left);
            mergeSort(right);

            // Merge two sorted halves into final
            merge(nums, left, right);
        }
    }

    private static void merge(int[] nums, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }

            k++;
        }

        // If there are remaining elements in the left half,
        // copy them directly into the final array
        while(i < left.length) {
            nums[k] = left[i];
            i++;
            k++;
        }

        // If there are remaining elements in the right half,
        // copy them directly into the final array
         while(j < right.length) {
             nums[k] = right[j];
             j++;
             k++;
         }
    }
}
