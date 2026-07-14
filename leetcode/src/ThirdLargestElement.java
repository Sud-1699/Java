public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(first < nums[i]) {
                second = first;
                first = nums[i];
            } else if(second < nums[i]) {
                third = second;
                second = nums[i];
            } else if (third < nums[i]) {
                third = nums[i];
            }
        }

        System.out.println(third);
    }
}
