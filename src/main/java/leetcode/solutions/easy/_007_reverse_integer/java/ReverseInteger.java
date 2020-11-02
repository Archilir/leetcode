package leetcode.solutions.easy._007_reverse_integer.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class ReverseInteger extends Executor implements Runner {
    public ReverseInteger() { }

    public int reverse(int x) {
        try {
            int reversed = 0;
            while (x != 0) {
                int num = x % 10;
                reversed = Math.addExact(Math.multiplyExact(reversed, 10), num);
                x /= 10;
            }
            return reversed;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public void run() {
        int x = 1534236469;
        this.run(x);
    }

    public void run(int x) {
        long startTime = System.currentTimeMillis();
        int solution = reverse(x);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("7. Reverse Integer");
        System.out.println("Input: " + x);
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
