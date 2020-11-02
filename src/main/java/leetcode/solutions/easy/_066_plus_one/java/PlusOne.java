package leetcode.solutions.easy._066_plus_one.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;
public class PlusOne extends Executor implements Runner {
    public PlusOne() {}
    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length-1);
    }

    private int[] plusOne(int[] digits, int index) {
        digits[index]++;
        if (digits[index] == 10) {
            digits[index] = 0;
            if (index == 0) {
                digits = Arrays.copyOf(digits, digits.length+1);
                digits[index] = 1;
            } else {
                digits = plusOne(digits, index-1);
            }
        }
        return digits;
    }

    public void run() {
        int[] digits = {0};
        this.run(digits);
    }

    public void run(int[] digits) {
        long startTime = System.currentTimeMillis();
        int[] solution = plusOne(digits);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("66. Plus One");
        System.out.println("Input: digits = " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(solution));

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
