package leetcode.solutions.medium._008_string_to_integer_atoi.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerAtoiTest {
    StringToIntegerAtoi solution;
    @Before
    public void setUp() throws Exception {
        solution = new StringToIntegerAtoi();
    }

    @Test
    public void case1_equals() {
        String s = "42";

        int expected = 42;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        String s = "   -42";

        int expected = -42;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        String s = "4193 with words";

        int expected = 4193;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        String s = "words and 987";

        int expected = 0;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        String s = "-91283472332";

        int expected = -2147483648;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case6_equals() {
        String s = "91283472332";

        int expected = 2147483647;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case7_equals() {
        String s = "+1";

        int expected = 1;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case8_equals() {
        String s = "+ 1";

        int expected = 0;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case9_equals() {
        String s = "-1";

        int expected = -1;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case10_equals() {
        String s = "- 1";

        int expected = 0;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case11_equals() {
        String s = "  0000000000012345678";

        int expected = 12345678;
        int actual = solution.myAtoi(s);

        assertEquals(expected, actual);
    }
}