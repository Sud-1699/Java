public class RemovingMaxAndMinFromArray {

    public static void main(String[] args) {
        RemovingMaxAndMinFromArray test = new RemovingMaxAndMinFromArray();

        System.out.println(test.minimumDeletions(new int[]{2,10,7,5,4,1,8,6}));
    }

    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;
        int n = nums.length;

        if(n == 1) return 1;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }

            if(nums[i] < nums[min]) {
                min = i;
            }
        }

        if (min < max) {
            min = min ^ max;
            max = min ^ max;
            min = min ^ max;
        }

        int ans = n;

        for (int i = 0; i <= n; i++) {
            int extra = 0;

            if (max >= i)
                extra = n - max;
            else if (min >= i)
                extra = n - min;

            ans = Math.min(ans, i + extra);
        }

        return ans;
    }
}
