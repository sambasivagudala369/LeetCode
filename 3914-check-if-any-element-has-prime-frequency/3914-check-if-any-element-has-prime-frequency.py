class Solution:
    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        def check(n):
            if n == 1:
                return False
            for i in range(2, n//2 + 1):
                if n % i == 0:
                    return False
            return True

        mapp = {}

        for i in nums:
            mapp[i] = mapp.get(i, 0) + 1
        
        for j in mapp.values():
            if check(j) == True:
                return True
        return False