package leetcode.solutions.easy._083_remove_duplicates_from_sorted_list.java;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList solution;
    @Before
    public void setUp() throws Exception {
        solution = new RemoveDuplicatesFromSortedList();
    }

    private int[] processCase(int[] i1) {
        ListNode head = ListNode.populate(i1);
        ListNode lnActual = solution.deleteDuplicates(head);
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
        int[] i1 = {1,1,2};

        int[] expected = {1,2};
        int[] actual = processCase(i1);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2_equals() {
        int[] i1 = {1,1,2,3,3};

        int[] expected = {1,2,3};
        int[] actual = processCase(i1);

        assertArrayEquals(expected, actual);
    }
}