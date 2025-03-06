package leetcode.solutions.easy._027_remove_element.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;

public class RemoveElement extends Executor implements Runner {
    public RemoveElement() {}

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    public void run() {
        int[] nums = {};
        int val = 3;
        this.run(nums, val);
    }

    public void run(int[] nums, int val) {
        long startTime = System.currentTimeMillis();
        int len = removeElement(nums,val);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("27. Remove Element");
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", val = " + val);
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
