class Solution {

    int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {

        int min = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int dis = i - map.get(nums[i]);

                if (dis < min)
                    min = dis;
            }

            map.put(reverse(nums[i]), i);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}