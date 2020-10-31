class Solution {
    public Solution() {}

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
