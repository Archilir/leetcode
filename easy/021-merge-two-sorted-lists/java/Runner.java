public class Runner {
    public static void main(String args[]) {
        int[] i1 = {1,2,4};
        int[] i2 = {1,3,4};
        ListNode l1 = ListNode.populate(i1);
        ListNode l2 = ListNode.populate(i2);

        Solution solver = new Solution();
        ListNode solution = solver.mergeTwoLists(l1, l2);

        System.out.println("Input: l1 = [" + ListNode.toString(l1) + "], l2 = [" + ListNode.toString(l2) + "]");
        System.out.println("Output: [" + ListNode.toString(solution) + "]");

    }
}
