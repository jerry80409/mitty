package two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void test1() {
        final int[] nums = new int[] { 2, 7, 11, 15 };
        final int target = 9;

        int[] act = TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[] { 0, 1 }, act);
    }

    @Test
    void test2() {
        final int[] nums = new int[] { 3, 3 };
        final int target = 6;

        int[] act = TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[] { 0, 1 }, act);
    }

    @Test
    void test3() {
        final int[] nums = new int[] { 3, 2, 4 };
        final int target = 6;

        int[] act = TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[] { 1, 2 }, act);
    }
}