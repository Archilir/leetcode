package leetcode.solutions.easy._035_search_insert_position.java.solution_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPosition_Solution1Test {
    SearchInsertPosition_Solution1 solution;
    @Before
    public void setUp() throws Exception {
        solution = new SearchInsertPosition_Solution1();
    }

    @Test
    public void case1_equals() {
        int[] nums = {1,3,5,6};
        int target = 5;

        int expected = 2;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] nums = {1,3,5,6};
        int target = 2;

        int expected = 1;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int[] nums = {1,3,5,6};
        int target = 7;

        int expected = 4;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        int[] nums = {1,3,5,6};
        int target = 0;

        int expected = 0;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        int[] nums = {1};
        int target = 0;

        int expected = 0;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void case6_equals() {
        int[] nums = {1,3,5};
        int target = 2;

        int expected = 1;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    public void case7_equals() {
        int[] nums = {1,3,5,6};
        int target = 2;

        int expected = 1;
        int actual = solution.searchInsert(nums, target);

        assertEquals(expected, actual);
    }
}