class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for x, x_num in enumerate(nums):
            second_num = target - x_num
            for y, y_num in enumerate(nums[x+1:], x+1):
                if y_num == second_num:
                    return [x, y]
