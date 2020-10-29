import java.util.Arrays;

class Solution {
    public Solution() {}
    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length-1);
    }

    private int[] plusOne(int[] digits, int index) {
        digits[index]++;
        if (digits[index] == 10) {
            digits[index] = 0;
            if (index == 0) {
                digits = Arrays.copyOf(digits, digits.length+1);
                digits[index] = 1;
            } else {
                digits = plusOne(digits, index-1);
            }
        }
        return digits;
    }
}
