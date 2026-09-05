public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 3}, 5));
    }

    public static int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            if(nums[l] == val) {
                while(r >= l && nums[r] == val) {
                    r--;
                }

                if(r < 0) {
                    return l;
                }

                nums[r] = nums[r] ^ nums[l];
                nums[l] = nums[r] ^ nums[l];
                nums[r] = nums[r] ^ nums[l];
            }

            l++;
        }

        return l;
    }
}
