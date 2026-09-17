class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if(nums.length <= 100_000) {

            for(int x : nums) {
                int index = Math.abs(x) - 1;
                nums[index] = -Math.abs(nums[index]);
            }

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > 0) {
                    list.add(i + 1);
                }
            }
        }

        return list;
    }
}