class Solution {
    public Solution() {}

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
}
