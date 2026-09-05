public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{2, 2, 1}));
    }

    public int singleNumber(int[] nums) {
        int result = 0;

        for(int num: nums) {
            result ^= num;
        }

        return result;
    }
}
