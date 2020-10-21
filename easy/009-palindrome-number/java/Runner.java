public class Runner {
    public static void main(String args[]) {
        int x = -1001;

        Solution solver = new Solution();

        boolean solution = solver.isPalindrome(x);
        System.out.println("Input: x = " + x);
        System.out.println("Output: " + solution);
    }

}
