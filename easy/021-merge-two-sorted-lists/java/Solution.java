class Solution {
    public Solution() {}

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            return (l2.val < l1.val) ?
                    new ListNode(l2.val, mergeTwoLists(l1, l2.next)) :
                    new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        } else if (l1 != null) {
            return new ListNode(l1.val, mergeTwoLists(l1.next, null));
        } else if (l2 != null) {
            return new ListNode(l2.val, mergeTwoLists(null, l2.next));
        }
        return null;
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
