class Solution {
    public Solution() { }

    public int reverse(int x) {
        try {
            int reversed = 0;
            while (x != 0) {
                int num = x % 10;
                reversed = Math.addExact(Math.multiplyExact(reversed, 10), num);
                x /= 10;
            }
            return reversed;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
