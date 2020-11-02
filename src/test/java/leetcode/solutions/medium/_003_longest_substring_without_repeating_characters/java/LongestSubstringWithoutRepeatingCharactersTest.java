package leetcode.solutions.medium._003_longest_substring_without_repeating_characters.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters solution;
    @Before
    public void setUp() throws Exception {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void case1_equals() {
        String s = "abcabcbb";

        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        String s = "bbbbb";

        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        String s = "pwwkew";

        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        String s = "";

        int expected = 0;
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case5_equals() {
        String s = " ";

        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case6_equals() {
        String s = "dvdf";

        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

}