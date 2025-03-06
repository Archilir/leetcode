package leetcode.solutions.medium._002_add_two_numbers.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class AddTwoNumbers extends Executor implements Runner {
    public AddTwoNumbers() {}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int offset = 0;
        ListNode end = new ListNode();
        ListNode pointer = end;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val;
                l1 = l1.next; l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                sum = sum % 10;
                offset = 1;
            } else {
                offset = 0;
            }

            pointer.val = pointer.val + sum;
            if (pointer.val > 9) {
                pointer.val = pointer.val % 10;
                pointer.next = new ListNode(1 + offset);
            }
            else if (offset == 1){
                pointer.next = new ListNode(offset);
            }
            else if (l1 != null || l2 != null){
                pointer.next = new ListNode(offset);
            }
            pointer = pointer.next;
        }

        return end;
    }

    public void run() {
        int[] i1 = {9,9,9,9,9,9,9};
        int[] i2 = {9,9,9,9};
        this.run(i1, i2);
    }

    public void run(int[] i1, int[] i2) {
        ListNode l1 = ListNode.populate(i1);
        ListNode l2 = ListNode.populate(i2);

        long startTime = System.currentTimeMillis();
        ListNode solution = addTwoNumbers(l1, l2);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("2. Add Two Numbers");
        System.out.println("Input: l1 = [" + ListNode.toString(l1) + "], l2 = [" + ListNode.toString(l2) + "]");
        System.out.println("Output: [" + ListNode.toString(solution) + "]");

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
                result += ",";
            node = node.next;
        }
        return result;
    }
 }
