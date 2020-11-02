public class Runner {
    public static void main(String args[]) {
        String s  = "bbbb";
        Solution solver = new Solution();

        System.out.println("Input: s = \"" + s + "\"");
        int solution = solver.lengthOfLongestSubstring(s);
        System.out.println("Output: " + solution);
    }
}
