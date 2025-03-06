package leetcode.solutions.easy._001_two_sum.java;
import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;

public class TwoSum extends Executor implements Runner {
    public TwoSum() { }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] answer = {i, j};
                    return answer;
                }
            }
        }
        return null;
    }

    public void run() {
        int[] nums = {2,7,11,15};
        int target = 9;
        this.run(nums, target);
    }

    public void run(int[] nums, int target) {
        String output;

        long startTime = System.currentTimeMillis();
        int[] solution = twoSum(nums, target);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("1. Two Sum");
        System.out.println("Input: " + Arrays.toString(nums));
        if (solution != null) {
            output = String.format("Output: [%d,%d]", solution[0], solution[1]) +
                    "\nOutput: Because nums[0] + nums[1] == " + target;
        } else {
            output = "No solution was found!";
        }
        System.out.println(output);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
