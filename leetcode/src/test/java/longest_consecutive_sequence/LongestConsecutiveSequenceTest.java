package longest_consecutive_sequence;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    @Test
    void test1() {
        val nums = new int[] { 100, 4, 200, 1, 3, 2 };
        val act = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(4, act);
    }

    @Test
    void test2() {
        val nums = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        val act = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(9, act);
    }

    @Test
    void test3() {
        val nums = new int[] { 1, 3, 5, 7 };
        val act = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(1, act);
    }

    @Test
    void test4() {
        val nums = new int[] { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };
        val act = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(7, act);
    }

    @Test
    void test5() {
        val nums = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        val act = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(9, act);
    }

    @Test
    void test6() {
        val nums = new int[] { 1, 2, 0, 1 };
        val act = LongestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(3, act);
    }
}