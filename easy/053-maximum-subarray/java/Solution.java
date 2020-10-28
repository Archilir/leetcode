class Solution {
    public Solution() {}

    public int maxSubArray(int[] nums) {
        int sumMax = 0;
        int sumCurrent = 0;
        int minNum = -2147483648;
        int minCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                minCount++;
                if (nums[i] > minNum) minNum = nums[i];
            }
            sumCurrent = (0 > sumCurrent + nums[i]) ? 0 : sumCurrent + nums[i];
            sumMax = (sumMax > sumCurrent) ? sumMax : sumCurrent;
        }
        return (minCount == nums.length) ? minNum : sumMax;
    }
}
