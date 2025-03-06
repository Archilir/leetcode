package leetcode.solutions.easy._058_length_of_last_word.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class LengthOfLastWord extends Executor implements Runner {
    public LengthOfLastWord() {}

    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (s.charAt(i) == ' ' && length > 0)
                return length;
        }
        return length;
    }

    public void run() {
        String s = "Hello world";
        this.run(s);
    }

    public void run(String s) {
        long startTime = System.currentTimeMillis();
        int solution = lengthOfLastWord(s);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("58. Length of Last Word");
        System.out.println("Input: nums = \"" + s + "\"");
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
