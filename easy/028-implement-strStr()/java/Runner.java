import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {
        String haystack = "mississippi";
        String needle = "ippi";
        Solution solver = new Solution();

        System.out.println("Input: haystack = \"" + haystack + "\", needle = \"" + needle + "\"");
        int solution = solver.strStr(haystack, needle);
        System.out.println("Output: " + solution);
    }
}
