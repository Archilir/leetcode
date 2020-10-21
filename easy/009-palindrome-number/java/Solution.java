import java.util.ArrayList;
import java.util.List;

class Solution {
    public Solution() { }

    public boolean isPalindrome(int x) {
        if (x < 0) return false; // cannot be a palindrome due to the negation symbol
        else if (x >= 0 && x <= 9) return true; // single chars are always palindrome
        else {
            List<Integer> digits = new ArrayList<>();
            // Extract digits one by one
            while (x != 0) {
                digits.add(x % 10);
                x /= 10;
            }

            // Initialize the left and right indices for traversal over the list
            int leftIndex = 0;
            int rightIndex = digits.size()-1;

            // Compare the digits for irregularities
            do {
                if (digits.get(leftIndex) != digits.get(rightIndex))
                    return false;
                leftIndex++;
                rightIndex--;
            } while(leftIndex <= digits.size()/2 || rightIndex >= digits.size()/2) ;

            // If no irregularities are detected, the value is a palindrome
            return true;
        }
    }
}
