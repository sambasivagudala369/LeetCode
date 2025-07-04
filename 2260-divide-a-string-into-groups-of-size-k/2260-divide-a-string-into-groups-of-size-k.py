class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        n = len(s)
        remainder = n % k
        if remainder:
            s += fill * (k - remainder)
        res = []
        for i in range(0, n, k):
            res.append(s[i : i + k])
        return res