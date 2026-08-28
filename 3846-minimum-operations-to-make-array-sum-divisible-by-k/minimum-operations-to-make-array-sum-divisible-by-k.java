class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0,op=0;
        if(nums.length>=1&&nums.length<=1000&&k>=1&&k<=1000){
        for(int x:nums){
            sum+=x;
        }
        while(sum%k!=0){
            sum--;
            op++;
        }
        }
        return op;
    }
}