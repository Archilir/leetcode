package leetcode.solutions.easy;
import leetcode.solutions.easy._001_two_sum.java.TwoSum;
import leetcode.solutions.easy._007_reverse_integer.java.ReverseInteger;
import leetcode.solutions.easy._009_palindrome_number.java.PalindromeNumber;
import leetcode.solutions.easy._013_roman_to_integer.java.RomanToInteger;
import leetcode.solutions.easy._020_valid_parenthesis.java.ValidParenthesis;
import leetcode.solutions.easy._026_remove_duplicates_from_sorted_array.java.RemoveDuplicatesFromSortedArray;
import leetcode.solutions.easy._027_remove_element.java.RemoveElement;
import leetcode.solutions.easy._028_implement_strStr.java.ImplementStrStr;
import leetcode.solutions.easy._035_search_insert_position.java.solution_1.SearchInsertPosition_Solution1;
import leetcode.solutions.easy._038_count_and_say.java.CountAndSay;
import leetcode.solutions.easy._053_maximum_subarray.java.MaximumSubarray;
import leetcode.solutions.easy._066_plus_one.java.PlusOne;
import leetcode.solutions.easy._069_sqrt_x.java.SqrtX;
import leetcode.solutions.easy._021_merge_two_sorted_lists.java.MergeTwoSortedLists;
import leetcode.solutions.easy._058_length_of_last_word.java.LengthOfLastWord;
import leetcode.generic.Loader;
import leetcode.solutions.easy._083_remove_duplicates_from_sorted_list.java.RemoveDuplicatesFromSortedList;
import leetcode.solutions.easy._088_merge_sorted_array.java.MergeSortedArray;

public class EasySolutions extends Loader {
    public EasySolutions() {
        add(new TwoSum());
        add(new ReverseInteger());
        add(new PalindromeNumber());
        add(new RomanToInteger());
        add(new ValidParenthesis());
        add(new MergeTwoSortedLists());
        add(new RemoveDuplicatesFromSortedArray());
        add(new RemoveElement());
        add(new ImplementStrStr());
        add(new SearchInsertPosition_Solution1());
        add(new CountAndSay());
        add(new MaximumSubarray());
        add(new LengthOfLastWord());
        add(new PlusOne());
        add(new SqrtX());
        add(new RemoveDuplicatesFromSortedList());
        add(new MergeSortedArray());
    }
}
