class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,j=0;
        if(nums.length>=0&&nums.length<=100&&val>=0&&val<=100){
        int[] num1 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
                num1[j++]=nums[i];
            }
        }
        for(int i=0;i<num1.length;i++){
            nums[i]=num1[i];
        }
        }
        return count;
    }
}