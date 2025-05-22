class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        n = len(s)
        l =0
        tsum =[]
        res=0
        for r in range(n):
            tsum.append(s[r])
            if(r-l == 3):
                tsum.pop(0)
                l+=1
            if(r-l+1==3):
                if len(set(tsum))==3:
                    res+=1
        return res
        