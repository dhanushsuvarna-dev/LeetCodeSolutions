class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int no_digit = 0;
            while(num!=0){
                no_digit++;
                num = num / 10;
            }
            if(no_digit%2==0){
                count++;
            }
        }
        return count;
    }
}