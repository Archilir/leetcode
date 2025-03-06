package leetcode.solutions.easy._020_valid_parenthesis.java;
import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Stack;

public class ValidParenthesis extends Executor implements Runner {
    public ValidParenthesis() { }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char target = ' ';
        for (char character: s.toCharArray()) {
            switch (character) {
                case '(': case '[': case '{':
                    stack.add(character);
                    break;
                case ')':
                    target = '(';
                    break;
                case ']':
                    target = '[';
                    break;
                case '}':
                    target = '{';
                    break;
                default:
                    target = ' ';
            }

            // If target character is primed
            if (target != ' ') {
                if (stack.empty() || stack.peek() != target)
                    return false;
                stack.pop();
                target = ' ';
            }
        }

        return (stack.empty()) ? true : false;
    }

    public void run() {
        String[] sArr = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        int count = 0;
        for (String s : sArr) {
            count += 1;
            System.out.println("\nExample " + count + ":");
            this.run(s);
        }
    }

    public void run(String s) {
        long startTime = System.currentTimeMillis();
        boolean solution = isValid(s);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("20. Valid Parenthesis");
        String result = String.format("Input: s = \"%s\"\nOutput: %s", s, solution);
        System.out.println(result);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
