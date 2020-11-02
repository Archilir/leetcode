package leetcode.solutions.easy._038_count_and_say.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class CountAndSay extends Executor implements Runner {
    public CountAndSay() {}

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder(str.length());
        int count = 1;
        char element  = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (element == str.charAt(i)) {
                count++;
            } else {
                if (element != ' ') {
                    sb.append(count);
                    sb.append(element);
                }
                element = str.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(element);
        return sb.toString();
    }

    public void run() {
        int n = 30;
        this.run(n);
    }

    public void run(int n) {
        long startTime = System.currentTimeMillis();
        String solution = countAndSay(n);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("38. Count and Say");
        System.out.println("Input: n = " + n);
        System.out.println("Output: \"" + solution + "\"");

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}