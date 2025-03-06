package leetcode.solutions.easy._035_search_insert_position.java.solution_1;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;

public class SearchInsertPosition_Solution1 extends Executor implements Runner {
    public SearchInsertPosition_Solution1() {}

    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length-1]) return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public void run() {
        int[] nums = {1,3,5};
        int target = 2;
        this.run(nums, target);
    }

    public void run(int[] nums, int target) {
        long startTime = System.currentTimeMillis();
        int solution = searchInsert(nums, target);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("35. Search Insert Position, solution 1");
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}