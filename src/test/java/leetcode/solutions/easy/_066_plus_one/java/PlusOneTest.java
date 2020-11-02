package leetcode.solutions.easy._066_plus_one.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {
    PlusOne solution;
    @Before
    public void setUp() throws Exception {
        solution = new PlusOne();
    }

    @Test
    public void case1_equals() {
        int[] digits = {1,2,3};

        int[] expected = {1,2,4};
        int[] actual = solution.plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] digits = {4,3,2,1};

        int[] expected = {4,3,2,2};
        int[] actual = solution.plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int[] digits = {0};

        int[] expected = {1};
        int[] actual = solution.plusOne(digits);

        assertArrayEquals(expected, actual);
    }
}