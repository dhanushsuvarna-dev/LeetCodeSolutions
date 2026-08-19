class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        boolean flag=true;
        if(n>=1&&n<=300){
        if(flag){
        for(int i=0;i<nums.length;i++){
            int k=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[k]){
                    k=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
        }
        }
        }
    }
}