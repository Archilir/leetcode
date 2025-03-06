class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        nums_dict = {}
        for idx, num in enumerate(nums):
            if nums_dict.get(num) is None:
                nums_dict[num] = idx
            else:
                return True
        return False
