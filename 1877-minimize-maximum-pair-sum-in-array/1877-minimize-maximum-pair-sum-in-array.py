class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        n=len(nums)
        ans=0
        for i in range(n):
            a=nums[i]+nums[n-i-1]
            ans=max(ans,a)
        return ans