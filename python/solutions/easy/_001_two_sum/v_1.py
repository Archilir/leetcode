class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for x, x_num in enumerate(nums):
            for y, y_num in enumerate(nums[x+1:], x+1):
                if y_num + x_num == target:
                    return [x, y]
