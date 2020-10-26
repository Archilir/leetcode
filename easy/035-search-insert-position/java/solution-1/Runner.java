import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {
        int[] nums = {1,3,5};
        int target = 2;
        Solution solver = new Solution();

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        int solution = solver.searchInsert(nums, target);
        System.out.println("Output: " + solution);
    }
}
