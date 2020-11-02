package leetcode.solutions.medium._003_longest_substring_without_repeating_characters.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters extends Executor implements Runner {
    public LongestSubstringWithoutRepeatingCharacters() {}

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int size = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else {
                    if (size < set.size()) size = set.size();
                    set.clear();
                    break;
                }
            }
        }
        return size;
    }

    public void run() {
        String s  = "bbbb";
        this.run(s);
    }

    public void run(String s) {
        long startTime = System.currentTimeMillis();
        int solution = lengthOfLongestSubstring(s);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("3. Longest Substring without Repeating Characters");
        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}