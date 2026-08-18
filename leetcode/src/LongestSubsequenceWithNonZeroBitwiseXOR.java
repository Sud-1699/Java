public class LongestSubsequenceWithNonZeroBitwiseXOR {
    public static void main(String[] args) {
        System.out.println(longestSubsequence(new int[]{7,6,1,9}));
    }

    public static int longestSubsequence(int[] nums) {
        if(nums.length == 1) return 1;

        int l = 0, r = 1;

        int bitwise = nums[l];
        int max = 0;
        while(r < nums.length) {
            bitwise = bitwise ^ nums[r];

            if(bitwise <= 0 && r == nums.length - 1) {
                l++;
            }

            r++;
            max = Math.max(max, (r - l));
        }

        return max;
    }
}
