package leetcode.solutions.medium;
import leetcode.solutions.medium._002_add_two_numbers.java.AddTwoNumbers;
import leetcode.solutions.medium._003_longest_substring_without_repeating_characters.java.LongestSubstringWithoutRepeatingCharacters;
import leetcode.generic.Loader;
import leetcode.solutions.medium._008_string_to_integer_atoi.java.StringToIntegerAtoi;

public class MediumSolutions extends Loader {
    public MediumSolutions() {
        add(new AddTwoNumbers());
        add(new LongestSubstringWithoutRepeatingCharacters());
        add(new StringToIntegerAtoi());
    }
}
