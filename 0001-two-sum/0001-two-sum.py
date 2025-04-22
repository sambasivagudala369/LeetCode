class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map_d = {}
        for i , num in enumerate(nums):
            diff = target-num
            if diff in map_d:
                return [map_d[diff],i]
            map_d[num] = i
        return []

        