class Solution:
    def intersection(self, nums1: list[int], nums2: list[int]) -> list[int]:
        nums = []
        for num in nums1:
            if num in nums2 and num not in nums:
                nums.append(num)
        return nums