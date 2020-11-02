package leetcode.solutions.easy._053_maximum_subarray.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    MaximumSubarray solution;
    @Before
    public void setUp() throws Exception {
        solution = new MaximumSubarray();
    }

    @Test
    public void case1_equals() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int expected = 6;
        int actual = solution.maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] nums = {1};

        int expected = 1;
        int actual = solution.maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int[] nums = {0};

        int expected = 0;
        int actual = solution.maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        int[] nums = {-1};

        int expected = -1;
        int actual = solution.maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        int[] nums = {-2147483647};

        int expected = -2147483647;
        int actual = solution.maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void case6_equals() {
        int[] nums = {-2,-1};

        int expected = -1;
        int actual = solution.maxSubArray(nums);

        assertEquals(expected, actual);
    }
}