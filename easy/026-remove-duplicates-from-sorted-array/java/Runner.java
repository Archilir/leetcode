import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {
        int[] nums = {0,1,1,2};
        Solution solver = new Solution();

        System.out.println("Input: nums = " + Arrays.toString(nums));
        int len = solver.removeDuplicates(nums);
        String s = "";
        for (int i = 0; i < len; i++) {
            s += nums[i];
            if (i < len-1) {
                s+= ", ";
            }
        }
        System.out.println("Output: " + len + ", nums = [" + s + "]");
    }
}
