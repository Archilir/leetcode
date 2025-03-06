package leetcode.solutions.easy._069_sqrt_x.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class SqrtX extends Executor implements Runner {
    public SqrtX() {}

    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int num = 1, root = 1, last;

        while (root <= x) {
            num += 1;
            last = root;
            root = num * num;
            if (root < last) {
                return num - 1;
            }
        }
        return num - 1;
    }

    public void run() {
        int x = 2147395600;
        this.run(x);
    }

    public void run(int x) {
        long startTime = System.currentTimeMillis();
        int solution = mySqrt(x);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("69. Sqrt(x)");
        System.out.println("Input: " + x);
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
