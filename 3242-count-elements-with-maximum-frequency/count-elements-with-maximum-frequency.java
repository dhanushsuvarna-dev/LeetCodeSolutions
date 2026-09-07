class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        if(nums.length>=1&&nums.length<=100)
        {
            int[] freq = new int[101];
            for(int num:nums){
                freq[num]+=1;
            }
            int max = 0;
            for(int i=1;i<=100;i++){
                if(max<freq[i]){
                    max=freq[i];
                }
            }
            for(int i=1;i<=100;i++){
                if(max==freq[i]){
                    count+=freq[i];
                }
            }
        }
        return count;
    }
}