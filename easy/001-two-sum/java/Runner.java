public class Runner {
    public static void main(String args[]) {
        int[] nums = {2,7,11,15};
        int target = 9;
        String output;

        Solution solver = new Solution();
        int[] solution = solver.twoSum(nums, target);

        if (solution != null) {
            output = String.format("Output: [%d,%d]", solution[0], solution[1]) +
                     "\nOutput: Because nums[0] + nums[1] == " + target;
        } else {
            output = "No solution was found!";
        }
        System.out.println(output);
    }

}
