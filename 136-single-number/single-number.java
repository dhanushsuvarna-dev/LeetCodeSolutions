class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n1 = nums[i];
            int count=0;
            for(int num : nums){
                if(n1==num){
                    count++;
                }
            }
            if(count==1){
                return n1;
            }
        }
        return 0;
    }
}