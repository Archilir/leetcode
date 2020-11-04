package leetcode.solutions.easy._088_merge_sorted_array.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    MergeSortedArray solution;
    @Before
    public void setUp() throws Exception {
        solution = new MergeSortedArray();
    }

    @Test
    public void case1_equals() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        int[] expected = {1,2,2,3,5,6};
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void case2_equals() {
        int[] nums1 = {1,2,3,0,0,0,0,0};
        int[] nums2 = {1,1,2,5,6};
        int m = 3, n = 5;

        int[] expected = {1,1,1,2,2,3,5,6};
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void case3_equals() {
        int[] nums1 = {1,2,3};
        int[] nums2 = {};
        int m = 3, n = 0;

        int[] expected = {1,2,3};
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void case4_equals() {
        int[] nums1 = {0,0,0};
        int[] nums2 = {2,5,7};
        int m = 0, n = 3;

        int[] expected = {2,5,7};
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }
}