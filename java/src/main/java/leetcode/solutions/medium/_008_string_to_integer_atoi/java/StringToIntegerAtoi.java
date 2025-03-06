package leetcode.solutions.medium._008_string_to_integer_atoi.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class StringToIntegerAtoi extends Executor implements Runner {
    public StringToIntegerAtoi() {}

    public int myAtoi(String s) {
        int solution = 0;
        int symbol = 1;
        boolean isNumber = false;
        for (char num: s.toCharArray()){
            if (!isNumber) {
                if (num != ' '){
                    isNumber = true;
                         if (num == '-')   { symbol = -1; }
                    else if (num == '+')   { continue;}
                    else if (num >= '0' &&
                             num <= '9')   { solution = num - '0'; }
                    else if (num != '-')   { return 0; }
                }
                continue;
            }
            if (num < '0' || num > '9') return symbol * solution;
            int x = num - '0';
            if (solution != 0) {
                if (symbol ==  1 && (Integer.MAX_VALUE - x) / solution <  10) return Integer.MAX_VALUE;
                if (symbol == -1 && (Integer.MIN_VALUE + x) / solution > -10) return Integer.MIN_VALUE;
            }
            solution *= 10;
            solution += x;
        }
        return symbol * solution;
    }

    public void run() {
        String s  = "-1";

        this.run(s);
    }

    public void run(String s) {
        long startTime = System.currentTimeMillis();
        int solution = myAtoi(s);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("8. String to Integer (atoi)");
        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}