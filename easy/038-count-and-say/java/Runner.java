public class Runner {
    public static void main(String args[]) {
        int n = 30;
        Solution solver = new Solution();

        System.out.println("Input: n = " + n);
        String solution = solver.countAndSay(n);
        System.out.println("Output: \"" + solution + "\"");
    }
}
