import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {
        int[] nums = {-3,-9,-2,-5};
        Solution solver = new Solution();

        System.out.println("Input: nums = " + Arrays.toString(nums));
        int solution = solver.maxSubArray(nums);
        System.out.println("Output: " + solution);
    }
}
