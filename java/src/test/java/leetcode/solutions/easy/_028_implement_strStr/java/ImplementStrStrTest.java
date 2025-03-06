package leetcode.solutions.easy._028_implement_strStr.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrStrTest {
    ImplementStrStr solution;
    @Before
    public void setUp() throws Exception {
        solution = new ImplementStrStr();
    }

    @Test
    public void case1_equals() {
        String haystack = "hello",
               needle   = "ll";

        int expected = 2;
        int actual = solution.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        String haystack = "aaaaa",
               needle   = "bba";

        int expected = -1;
        int actual = solution.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        String haystack = "",
               needle   = "";

        int expected = 0;
        int actual = solution.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        String haystack = "abc",
               needle   = "c";

        int expected = 2;
        int actual = solution.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        String haystack = "mississippi",
               needle   = "issip";

        int expected = 4;
        int actual = solution.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void case6_equals() {
        String haystack = "mississippi",
               needle   = "issipi";

        int expected = -1;
        int actual = solution.strStr(haystack, needle);

        assertEquals(expected, actual);
    }
}