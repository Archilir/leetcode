package leetcode.solutions.easy._007_reverse_integer.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {
    ReverseInteger solution;

    @Before
    public void setUp() throws Exception {
        solution = new ReverseInteger();
    }

    @Test
    public void case1_equals() {
        int x = 123;
        int expected = 321;
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int x = -123;

        int expected = -321;
        int actual = solution.reverse(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int x = 120;

        int expected = 21;
        int actual = solution.reverse(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        int x = 0;

        int expected = 0;
        int actual = solution.reverse(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        int x = 1534236469;

        int expected = 0;
        int actual = solution.reverse(x);

        assertEquals(expected, actual);
    }
}