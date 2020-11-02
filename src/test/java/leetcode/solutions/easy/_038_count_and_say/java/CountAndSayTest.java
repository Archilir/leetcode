package leetcode.solutions.easy._038_count_and_say.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {
    CountAndSay solution;
    @Before
    public void setUp() throws Exception {
        solution = new CountAndSay();
    }

    @Test
    public void case1_equals() {
        int n = 1;

        String expected = "1";
        String actual = solution.countAndSay(n);

        assertEquals(expected, actual);
    }
}