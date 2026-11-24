
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] num = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;

            for (int j = 0; j < i; j++) {
                left += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                right += nums[k];
            }

            num[i] = Math.abs(left - right);
        }

        return num;
    }
}
