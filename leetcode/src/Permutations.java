import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        bt(nums, new ArrayList<>());
        return result;
    }


    public static void bt(int[] nums, List<Integer> path) {
        if(path.size() == nums.length) {
            result.add(path);
            return;
        }

        for(int num: nums) {
            path.add(num);
            bt(nums, path);
            path.removeLast();
        }
    }
}
