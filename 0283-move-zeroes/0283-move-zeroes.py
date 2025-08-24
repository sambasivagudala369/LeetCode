class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        pos = 0  # position for next non-zero
        
        # Step 1: Move all non-zero elements to the front
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[pos] = nums[i]
                pos += 1
        
        # Step 2: Fill the remaining positions with zeros
        for i in range(pos, len(nums)):
            nums[i] = 0

      
        