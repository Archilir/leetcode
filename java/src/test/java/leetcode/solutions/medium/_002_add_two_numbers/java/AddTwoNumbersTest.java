package leetcode.solutions.medium._002_add_two_numbers.java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    AddTwoNumbers solution;
    @Before
    public void setUp() throws Exception {
        solution = new AddTwoNumbers();
    }

    private int[] processCase(int[] i1, int[] i2) {
        ListNode l1 = ListNode.populate(i1);
        ListNode l2 = ListNode.populate(i2);
        ListNode lnActual = solution.addTwoNumbers(l1, l2);
        List<Integer> lActual = new ArrayList<>();

        while (lnActual != null) {
            lActual.add(lnActual.val);
            lnActual = lnActual.next;
        }

        int[] actual = lActual.stream().mapToInt(i -> i).toArray();
        return actual;
    }

    @Test
    public void case1_equals() {
        int[] i1 = {2,4,3};
        int[] i2 = {5,6,4};

        int[] expected = {7,0,8};
        int[] actual = processCase(i1, i2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] i1 = {0};
        int[] i2 = {0};

        int[] expected = {0};
        int[] actual = processCase(i1, i2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int[] i1 = {9,9,9,9,9,9,9};
        int[] i2 = {9,9,9,9};

        int[] expected = {8,9,9,9,0,0,0,1};
        int[] actual = processCase(i1, i2);

        assertArrayEquals(expected, actual);
    }
}