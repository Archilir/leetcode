package leetcode.solutions.easy._021_merge_two_sorted_lists.java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists solution;
    @Before
    public void setUp() throws Exception {
        solution = new MergeTwoSortedLists();
    }

    private int[] processCase(int[] i1, int[] i2) {
        ListNode l1 = ListNode.populate(i1);
        ListNode l2 = ListNode.populate(i2);
        ListNode lnActual = solution.mergeTwoLists(l1, l2);
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
        int[] i1 = {1,2,4};
        int[] i2 = {1,3,4};

        int[] expected = {1,1,2,3,4,4};
        int[] actual = processCase(i1, i2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] i1 = {};
        int[] i2 = {};

        int[] expected = {};
        int[] actual = processCase(i1, i2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3_equals() {
        int[] i1 = {};
        int[] i2 = {0};

        int[] expected = {0};
        int[] actual = processCase(i1, i2);

        assertArrayEquals(expected, actual);
    }
}