class Solution:
    def isPalindrome(self, x: int) -> bool:
        res = str(x)[::-1]
        if str(x) == res:
            return True
        else:
            return False
