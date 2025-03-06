package leetcode.solutions.easy._013_roman_to_integer.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {
    RomanToInteger solution;
    @Before
    public void setUp() throws Exception {
        solution = new RomanToInteger();
    }

    @Test
    public void case1_equals() {
        String s = "III";

        int expected = 3;
        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        String s = "IV";

        int expected = 4;
        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        String s = "IX";

        int expected = 9;
        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        String s = "LVIII";

        int expected = 58;
        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        String s = "MCMXCIV";

        int expected = 1994;
        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }
}