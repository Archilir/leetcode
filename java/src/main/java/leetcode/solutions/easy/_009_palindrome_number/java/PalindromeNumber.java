package leetcode.solutions.easy._009_palindrome_number.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber extends Executor implements Runner {
    public PalindromeNumber() { }

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

    public void run() {
        int x = -1001;
        this.run(x);
    }

    public void run(int x) {
        long startTime = System.currentTimeMillis();
        boolean solution = isPalindrome(x);
        long endTime = System.currentTimeMillis();

        printSolutionTitle("9. Palindrome Number");
        System.out.println("Input: x = " + x);
        System.out.println("Output: " + solution);

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
