package leetcode.solutions.easy._026_remove_duplicates_from_sorted_array.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray solution;
    @Before
    public void setUp() throws Exception {
        solution = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void case1_equals() {
        int[] nums = {1,1,2};

        int expected = 2;
        int actual = solution.removeDuplicates(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int expected = 5;
        int actual = solution.removeDuplicates(nums);

        assertEquals(expected, actual);
    }

}