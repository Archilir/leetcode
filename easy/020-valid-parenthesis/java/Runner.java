public class Runner {
    public static void main(String args[]) {
        String[] sArr = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        int count = 0;
        Solution solver = new Solution();
        for (String s: sArr) {
            count += 1;
            String result = String.format("Input: s = \"%s\"\nOutput: %s", s, solver.isValid(s));
            System.out.println("\nExample " + count + ":");
            System.out.println(result);
        }

    }
}
