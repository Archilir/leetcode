package leetcode.solutions.easy._058_length_of_last_word.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    LengthOfLastWord solution;
    @Before
    public void setUp() throws Exception {
        solution = new LengthOfLastWord();
    }

    @Test
    public void case1_equals() {
        String s = "Hello World";

        int expected = 5;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(expected, actual);
    }
}