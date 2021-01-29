package longest_consecutive_sequence;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
@Slf4j
class LongestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {
        if (0 == nums.length) {
            return 0;
        }

        int longest = 1;
        nums = IntStream.of(nums).distinct().sorted().toArray();
        List<Integer> longestSet = new ArrayList<>(nums.length);

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int before = nums[i - 1];
            // check sequence
            if (current - before == 1) {
                longest ++;
                log.info("longest: {}", longest);
            } else {
                longest = 1;
            }

            longestSet.add(longest);
        }

        return longestSet.stream().max(Comparator.comparing(Integer::intValue)).orElse(1);
    }
}
