package leetcode.solutions.easy._026_remove_duplicates_from_sorted_array.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray extends Executor implements Runner {
    public RemoveDuplicatesFromSortedArray() {}

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pointer] != nums[i]) {
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer + 1;
    }

    public void run() {
        int[] nums = {0,1,1,2};
        this.run(nums);
    }

    public void run(int[] nums) {
        long startTime = System.currentTimeMillis();
        int len = removeDuplicates(nums);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("26. Remove Duplicates from Sorted Array");
        System.out.println("Input: nums = " + Arrays.toString(nums));
        String s = "";
        for (int i = 0; i < len; i++) {
            s += nums[i];
            if (i < len-1) {
                s+= ", ";
            }
        }
        System.out.println("Output: " + len + ", nums = [" + s + "]");

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
