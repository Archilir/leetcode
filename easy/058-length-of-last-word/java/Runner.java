import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {
        String s = "Hello world";
        Solution solver = new Solution();

        System.out.println("Input: nums = \"" + s + "\"");
        int solution = solver.lengthOfLastWord(s);
        System.out.println("Output: " + solution);
    }
}
