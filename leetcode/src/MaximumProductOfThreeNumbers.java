public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println(maximumProductV1(new int[]{1, 2, 3, 4}));
    }

    public static int maximumProduct(int[] nums) {
        int k = 3;

        if(nums.length < k) {
            return -1;
        }

        int window = 1;
        for(int i = 0; i < k; i++) {
            window *= nums[i];
        }

        int max = window;
        for(int j = k; j < nums.length; j++) {
            window = window - nums[j] * nums[j - k];
            max = Math.max(max, window);
        }

        return max;
    }

    public static int maximumProductV1(int[] nums) {
        if(nums.length < 3) {
            return -1;
        }

        int max = 0;
        int window = 1;
        int l = 0, r = 0;
//        for(int i = l; i < nums.length; i++) {
        while(l < r) {
            int s = 0;
            while(s < 3) {
                window *= nums[l + s];
                s++;
            }

            max = Math.max(max, window);
            window = 1;
            l++;
        }
//        }

        return max;
    }
}
