public class PredictTheWinner {

    public static void main(String[] args) {
        PredictTheWinner test = new PredictTheWinner();
        System.out.println(test.predictTheWinner(new int[]{1,5,233, 7}));
    }

    public boolean predictTheWinner(int[] nums) {
        int sum1 = 0, sum2 = 0;
        int l = 0, r = nums.length - 1;
        int player = 0;

        while(l < r) {
            if(player % 2 == 0) { // player 1
                if(nums[l] > nums[r]) {
                    sum1 += nums[l];
                    l++;
                } else {
                    sum1 += nums[r];
                    r--;
                }

                player = 1;
            } else { // player 2
                if(nums[l] > nums[r]) {
                    sum2 += nums[l];
                    l++;
                } else {
                    sum2 += nums[r];
                    r--;
                }

                player = 0;
            }
        }

        if(sum1 > sum2) {
            return true;
        }

        if(sum1 == sum2) {
            return true;
        }

        return false;
    }
}
