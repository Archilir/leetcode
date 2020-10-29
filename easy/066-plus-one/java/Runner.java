import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {
        int[] digits = {0};
        Solution solver = new Solution();

        System.out.println("Input: digits = " + Arrays.toString(digits));
        int[] solution = solver.plusOne(digits);
        System.out.println("Output: " + Arrays.toString(solution));
    }
}
