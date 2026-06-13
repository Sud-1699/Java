import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 5, 3, 9, 4, 1};

        int n = nums.length;
        buildMaxHeap(nums);
        for(int i = 0; i < n - 1    ; i++) {
            nums[0] = nums[0] ^ nums[i];
            nums[i] = nums[0] ^ nums[i];
            nums[0] = nums[0] ^ nums[i];

            n -= 1;
            heapify(0, nums);
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void buildMaxHeap(int[] nums) {
        for(int i = 0; i < Math.floor(nums.length / 2); i++) {
            heapify(i, nums);
        }
    }

    private static void heapify(int i, int[] nums) {
        int max = 0, left = 2 * i, right = 2 * i + 1;
        if(left <= nums.length && nums[left] > nums[i]) {
            max = left;
        } else {
            max = i;
        }

        if(right <= nums.length && nums[right] > nums[max]) {
            max = right;
        }

        if(max != i) {
            nums[i] = nums[i] ^ nums[max];
            nums[max] = nums[i] ^ nums[max];
            nums[i] = nums[i] ^ nums[max];

            heapify(max, nums);
        }
    }
}
