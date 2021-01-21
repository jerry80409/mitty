package two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Map(diff, nums index)
        final Map<Integer, Integer> cache = new HashMap<>();
        final int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i])) {
                int index = cache.get(nums[i]);
                result[0] = index;
                result[1] = i;
                return result;
            } else {
                // put [diff, index]
                cache.put(target - nums[i], i);
            }
        }
        return result;
    }
}
