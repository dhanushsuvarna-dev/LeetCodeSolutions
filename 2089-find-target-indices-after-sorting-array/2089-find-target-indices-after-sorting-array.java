
import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        // Find the first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Collect all target indices
        while (low < nums.length && nums[low] == target) {
            res.add(low);
            low++;
        }

        return res;
    }
}
