class Solution {
    int low(int[] nums){
        int low=nums[0];
        for(int x:nums){
            if(low>x) low=x;
        }
        return low;
    }
    public int minElement(int[] nums) {
        if(nums.length>=1&&nums.length<=100){
        for(int i=0;i<nums.length;i++){
            int x = nums[i],num=0;
            while(x!=0){
                num += x%10;
                x /=10;
            }
            nums[i] = num;
        }
        int min = low(nums);
        return min;
        }
        return 0;
    }
}