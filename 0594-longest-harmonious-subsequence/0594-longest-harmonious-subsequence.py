class Solution:
    def findLHS(self, nums: List[int]) -> int:
        from collections import Counter
        cnt = Counter(nums)
        res = 0
        for k in cnt:
            if k + 1 in cnt:
                res = max(res, cnt[k] + cnt[k + 1])
        return res

        