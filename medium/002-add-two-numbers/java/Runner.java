public class Runner {
    public static void main(String args[]) {
        int[] i1 = {9,9,9,9,9,9,9};
        int[] i2 = {9,9,9,9};

        ListNode l1 = ListNode.populate(i1);
        ListNode l2 = ListNode.populate(i2);

        Solution solver = new Solution();
        ListNode solution = solver.addTwoNumbers(l1, l2);

        System.out.println("Input: l1 = [" + ListNode.toString(l1) + "], l2 = [" + ListNode.toString(l2) + "]");
        System.out.println("Output: [" + ListNode.toString(solution) + "]");
    }
}
