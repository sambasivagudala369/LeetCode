class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        arr = [(val, i) for i, val in enumerate(nums)]
        arr.sort(key=lambda x: -x[0])
        top_k = sorted(arr[:k], key=lambda x: x[1])
        return [val for val, _ in top_k]