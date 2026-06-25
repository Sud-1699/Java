
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 6, 10, 15, 20, 35, 40, 60, 75, 90, 95, 100, 115};

        int result = binarySearchIterative(nums, 2);
        System.out.println("Found the target using iterative way at indices: " + result);

        int result1 = binarySearchRecursive(nums, 111, 0, nums.length - 1);
        System.out.println("Found the target using recursive way at indices: " + result1);
    }

    private static int binarySearchIterative(int[] nums, int target) {
        int l = 0, h = nums.length - 1;

        while(l <= h) {
            int mid = (l + h) / 2;
            if(target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    private static int binarySearchRecursive(int[] nums, int target, int l, int h) {
        // Base case
        if(l > h) {
            return -1;
        }

        int mid = (l + h) / 2;
        if(target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearchRecursive(nums, target, l, mid - 1);
        } else {
            return binarySearchRecursive(nums, target, mid + 1, h);
        }
    }
}