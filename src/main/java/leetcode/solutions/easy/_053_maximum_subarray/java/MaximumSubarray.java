package leetcode.solutions.easy._053_maximum_subarray.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;

public class MaximumSubarray extends Executor implements Runner {
    public MaximumSubarray() {}

    public int maxSubArray(int[] nums) {
        int sumMax = 0;
        int sumCurrent = 0;
        int minNum = -2147483648;
        int minCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                minCount++;
                if (nums[i] > minNum) minNum = nums[i];
            }
            sumCurrent = (0 > sumCurrent + nums[i]) ? 0 : sumCurrent + nums[i];
            sumMax = (sumMax > sumCurrent) ? sumMax : sumCurrent;
        }
        return (minCount == nums.length) ? minNum : sumMax;
    }

    public void run() {
        int[] nums = {-3,-9,-2,-5};
        this.run(nums);
    }

    public void run(int[] nums) {
        long startTime = System.currentTimeMillis();
        int solution = maxSubArray(nums);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("53. Maximum Subarray");
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
