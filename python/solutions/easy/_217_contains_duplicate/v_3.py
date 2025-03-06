class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        num_set = set(nums)
        if len(num_set) == len(nums):
            return False
        return True
