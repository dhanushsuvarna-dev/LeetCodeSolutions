class Solution:
    def pivotIndex(self, nums: list[int]) -> int:
        n = len(nums)
        for i in range(n):
            if sum(nums[:i]) == sum(nums[i+1:n]):
                return i
        return -1
