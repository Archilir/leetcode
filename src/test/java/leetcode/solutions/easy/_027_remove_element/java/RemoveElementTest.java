package leetcode.solutions.easy._027_remove_element.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {
    RemoveElement solution;
    @Before
    public void setUp() throws Exception {
        solution = new RemoveElement();
    }

    @Test
    public void case1_equals() {
        int[] nums = {3,2,2,3};
        int val = 3;

        int expected = 2;
        int actual = solution.removeElement(nums, val);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int expected = 5;
        int actual = solution.removeElement(nums, val);

        assertEquals(expected, actual);
    }
}