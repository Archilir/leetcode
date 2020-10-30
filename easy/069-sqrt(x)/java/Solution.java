class Solution {
    public Solution() {}

    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int num = 1, root = 1, last;

        while (root <= x) {
            num += 1;
            last = root;
            root = num * num;
            if (root < last) {
                return num - 1;
            }
        }
        return num - 1;
    }
}
