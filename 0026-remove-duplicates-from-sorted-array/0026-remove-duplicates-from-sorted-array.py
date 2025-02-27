class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i=1
        while i<len(nums):
            if nums[i] == nums[i-1]:
                del nums[i] #using del is the best option instead of using pop
            else:
                i+=1
        return len(nums)          