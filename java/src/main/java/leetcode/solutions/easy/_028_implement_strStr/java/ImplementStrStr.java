package leetcode.solutions.easy._028_implement_strStr.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

public class ImplementStrStr extends Executor implements Runner {
    public ImplementStrStr() {}

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && (haystack.length() - i) >= needle.length()) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(j+i) != needle.charAt(j)) {
                        break;
                    } else if (haystack.charAt(j+i) == needle.charAt(j) && j == needle.length()-1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public void run() {
        String haystack = "mississippi";
        String needle = "ippi";
        this.run(haystack, needle);
    }

    public void run(String haystack, String needle) {
        long startTime = System.currentTimeMillis();
        int solution = strStr(haystack, needle);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("28. Implement strStr()");
        System.out.println("Input: haystack = \"" + haystack + "\", needle = \"" + needle + "\"");
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
