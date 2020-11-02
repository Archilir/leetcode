package leetcode.solutions.easy._009_palindrome_number.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {
    PalindromeNumber solution;
    @Before
    public void setUp() throws Exception {
        solution = new PalindromeNumber();
    }

    @Test
    public void case1_equals() {
        int x = 121;
        boolean actual = solution.isPalindrome(x);
        assertTrue(actual);
    }

    @Test
    public void case2_equals() {
        int x = -121;
        boolean actual = solution.isPalindrome(x);
        assertFalse(actual);
    }

    @Test
    public void case3_equals() {
        int x = 10;
        boolean actual = solution.isPalindrome(x);
        assertFalse(actual);
    }

    @Test
    public void case4_equals() {
        int x = -101;
        boolean actual = solution.isPalindrome(x);
        assertFalse(actual);
    }

}