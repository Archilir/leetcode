package leetcode.solutions.easy._069_sqrt_x.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtXTest {
    SqrtX solution;
    @Before
    public void setUp() throws Exception {
        solution = new SqrtX();
    }

    @Test
    public void case1_equals() {
        int x = 4;

        int expected = 2;
        int actual = solution.mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int x = 8;

        int expected = 2;
        int actual = solution.mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int x = 1;

        int expected = 1;
        int actual = solution.mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case4_equals() {
        int x = 2147395600;

        int expected = 46340;
        int actual = solution.mySqrt(x);

        assertEquals(expected, actual);
    }
}