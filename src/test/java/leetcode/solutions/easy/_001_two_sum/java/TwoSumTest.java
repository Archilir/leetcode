package leetcode.solutions.easy._001_two_sum.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum solution;

    @Before
    public void setUp() throws Exception {
        solution = new TwoSum();
    }

    @Test
    public void case1_equals() {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] expected = {0, 1};
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] nums = {3,2,4};
        int target = 6;

        int[] actual = solution.twoSum(nums, target);
        int[] expected = {1,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int[] nums = {3,3};
        int target = 6;

        int[] actual = solution.twoSum(nums, target);
        int[] expected = {0,1};

        assertArrayEquals(expected, actual);
    }
}