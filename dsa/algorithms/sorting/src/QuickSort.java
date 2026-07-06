import java.util.Arrays;

public class QuickSort {
    static int[] nums = {9, 3, 7, 5, 6, 4, 8, 2};

    public static void main(String[] args) {
        quickSort(0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int l, int h) {
        if(l < h) {
            int j = partition(l, h);
            quickSort(l, j);
            quickSort(j + 1, h);
        }
    }

    static int partition(int l, int h) {
        int pivot = nums[l];

        int i = l, j = h;
        while(i < j) {
            do {
                i++;
            } while (nums[i] <= pivot);

            do {
                j--;
            } while (nums[j] > pivot);

            if(i < j)
                swap(i, j);
        }

        swap(l, j);
        return j;
    }

    static void swap(int l, int h) {
        nums[l] = nums[l] ^ nums[h];
        nums[h] = nums[l] ^ nums[h];
        nums[l] = nums[l] ^ nums[h];
    }
}
