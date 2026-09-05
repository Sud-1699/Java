public class SmallestStableIndexII {
    public static void main(String[] args) {
        System.out.println(new SmallestStableIndexII().firstStableIndex(new int[]{6,3,2,0,4,10,5}, 1));
    }

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int stableIdx = 0;
        for(int i = 0; i < n; i++) {
            // find max
            int max = fetchMax(0, i, nums);
            int min = fetchMin(i, n, nums);

            if((max - min) <= k && stableIdx < i) {
                return i;
            } else {
                stableIdx = i;
            }
        }

        return -1;
    }

    public int fetchMax(int s, int e, int[] nums) {
        int max = nums[s];

        for(int i = s; i < e; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public int fetchMin(int s, int e, int[] nums) {
        int min = nums[s];
        for(int i = s; i < e; i++) {
            min = Math.min(min, nums[i]);
        }

        return min;
    }
}
