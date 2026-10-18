class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int total = 0, j = 0;
        for(int i = 0 ;i < nums.length; i++){
            total += nums[i];
            while(total>=target){
                res = Math.min(i-j+1,res);
                total -= nums[j];
                j++;
            }
           
        }
        return res == Integer.MAX_VALUE ? 0 : res;  
    }
}