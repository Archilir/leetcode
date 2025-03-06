class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        idx_dict = {}
        for x, x_num in enumerate(nums):
            target_num = target - x_num
            dict_idx = idx_dict.get(target_num)
            if dict_idx is None:
                idx_dict[x_num] = x
            else:
                return [dict_idx, x]
