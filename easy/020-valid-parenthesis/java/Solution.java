import java.util.Stack;

class Solution {
    public Solution() { }

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
}
