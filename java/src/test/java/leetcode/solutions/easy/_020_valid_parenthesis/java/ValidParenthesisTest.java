package leetcode.solutions.easy._020_valid_parenthesis.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {
    ValidParenthesis solution;

    @Before
    public void setUp() throws Exception {
        solution = new ValidParenthesis();
    }

    @Test
    public void case1_equals() {
        String s = "()";

        boolean actual = solution.isValid(s);

        assertTrue(actual);
    }

    @Test
    public void case2_equals() {
        String s = "()[]{}";

        boolean actual = solution.isValid(s);

        assertTrue(actual);
    }

    @Test
    public void case3_equals() {
        String s = "(]";

        boolean actual = solution.isValid(s);

        assertFalse(actual);
    }

    @Test
    public void case4_equals() {
        String s = "([)]";

        boolean actual = solution.isValid(s);

        assertFalse(actual);
    }

    @Test
    public void case5_equals() {
        String s = "{[]}";

        boolean actual = solution.isValid(s);

        assertTrue(actual);
    }
}