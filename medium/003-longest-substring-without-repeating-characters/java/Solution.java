import java.util.HashSet;

class Solution {
    Solution() {}

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
}