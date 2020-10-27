class Solution {
    Solution() {}

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
}