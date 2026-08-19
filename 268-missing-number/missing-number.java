class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        if (n < 1 || n > 10000) {
            return -1;
        }
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            if (num < 0 || num > n || seen[num]) {
                return -1;
            }
            seen[num] = true;
        }

        int ans = n;

        for (int i = 0; i < n; i++) {
            ans = ans ^ i ^ nums[i];
        }

        return ans;
    }
}