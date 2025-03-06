package leetcode.solutions.easy._088_merge_sorted_array.java;

import leetcode.generic.Executor;
import leetcode.generic.Runner;

import java.util.Arrays;

public class MergeSortedArray extends Executor implements Runner {
    public MergeSortedArray() {}

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer_m = 0, pointer_n = 0, swap = 0;
        if (nums2.length != 0) {
            while (pointer_m < nums1.length) {
                if (pointer_m >= m) {
                    nums1[pointer_m] = nums2[pointer_n];
                    pointer_n++;
                } else if (nums1[pointer_m] > nums2[pointer_n]) {
                    swap = nums1[pointer_m];
                    nums1[pointer_m] = nums2[pointer_n];
                    nums2[pointer_n] = swap;
                    nums2 = Arrays.stream(nums2).sorted().toArray();
                }
                pointer_m++;
            }
        }
    }

    public void run() {
        //int[] nums1 = {1,2,3,0,0,0};
        //int[] nums2 = {2,5,6};
        //int m = 3, n = 3;
        int[] nums1 = {0,0};
        int[] nums2 = {1,2};
        int m = 0, n = 2;
        this.run(nums1, m, nums2, n);
    }

    public void run(int[] nums1, int m, int[] nums2, int n) {
        printSolutionTitle("88. Merge Sorted Array");
        System.out.println("Input: " + Arrays.toString(nums1));

        long startTime = System.currentTimeMillis();
        merge(nums1, m, nums2, n);
        long endTime = System.currentTimeMillis();

        System.out.println("Output: " + Arrays.toString(nums1));

        printElapsedTimeInMilliseconds(startTime, endTime);
    }
}
