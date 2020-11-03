package leetcode.solutions.easy._083_remove_duplicates_from_sorted_list.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class RemoveDuplicatesFromSortedList extends Executor implements Runner {
    public RemoveDuplicatesFromSortedList() {}

    public ListNode deleteDuplicates(ListNode head) {
        ListNode last = null;
        ListNode pointer = head;
        while (pointer != null) {
            if (last != null) {
                if (last.val != pointer.val) {
                    last.next = pointer;
                    last = pointer;
                } else {
                    last.next = null;
                }
            } else {
                last = pointer;
            }
            pointer = pointer.next;
        }
        return head;
    }

    public void run() {
        int[] i1 = {1,1,2,3,3};
        this.run(i1);
    }

    public void run(int[] i1) {
        ListNode head = ListNode.populate(i1);

        System.out.println("Input: " + ListNode.toString(head));

        long startTime = System.currentTimeMillis();
        ListNode solution = deleteDuplicates(head);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("83. Remove Duplicates from Sorted List");
        System.out.println("Output: " + ListNode.toString(solution));

        printElapsedTimeInMilliseconds(startTime, endTime);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode populate(int[] arr) {
        return (arr.length != 0) ? populate(0, arr) : null;
    }

    private static ListNode populate(int index, int[] arr) {
        if (index < arr.length - 1) {
            return new ListNode(arr[index], populate(index + 1, arr));
        }
        return new ListNode(arr[index]);
    }

    public static String toString(ListNode node) {
        String result = "";
        while (node != null) {
            result += node.val;
            if (node.next != null)
                result += "->";
            node = node.next;
        }
        return result;
    }
}
