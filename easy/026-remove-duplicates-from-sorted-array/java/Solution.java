class Solution {
    public Solution() {}

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pointer] != nums[i]) {
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer + 1;
    }
}
