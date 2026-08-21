class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        result = 0
        for j in nums:
            if(result not in nums):
                return result
            result += 1
        if(len(nums) not in nums):
            return len(nums)
        return -1