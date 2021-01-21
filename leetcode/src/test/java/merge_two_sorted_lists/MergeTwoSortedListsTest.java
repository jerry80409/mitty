package merge_two_sorted_lists;

import merge_two_sorted_lists.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    /**
     * input: null [0]
     * expect: [0]
     */
    @Test
    public void test1() {
        final ListNode n1 = null;
        final ListNode n2 = new ListNode(0);

        ListNode act = MergeTwoSortedLists.mergeTwoLists(n1, n2);

        assertEquals(0, act.val);
    }

    /**
     * input: [2] [1]
     * expect: [1, 2]
     */
    @Test
    public void test2() {
        final ListNode n1 = new ListNode(2);
        final ListNode n2 = new ListNode(1);

        ListNode act = MergeTwoSortedLists.mergeTwoLists(n1, n2);

        assertEquals(1, act.val);
        assertEquals(2, act.next.val);
    }

    /**
     * input: [1] [2]
     * expect: [1, 2]
     */
    @Test
    public void test3() {
        final ListNode n1 = new ListNode(1);
        final ListNode n2 = new ListNode(2);

        ListNode act = MergeTwoSortedLists.mergeTwoLists(n1, n2);

        assertEquals(1, act.val);
        assertEquals(2, act.next.val);
    }

    /**
     * input: [5] [1, 2, 4]
     * expect: [1, 2, 4, 5]
     */
    @Test
    public void test4() {
        final ListNode n1 = new ListNode(5);
        final ListNode n2 = new ListNode(1);
        final ListNode n3 = new ListNode(2);
        final ListNode n4 = new ListNode(4);
        n2.next = n3;
        n3.next = n4;

        ListNode act = MergeTwoSortedLists.mergeTwoLists(n1, n2);
        assertEquals(1, act.val);
        assertEquals(2, act.next.val);
        assertEquals(4, act.next.next.val);
        assertEquals(5, act.next.next.next.val);
    }

    /**
     * input: [-9, 3] [5, 7]
     * expect: [-9, 3, 5, 7]
     */
    @Test
    public void test5() {
        final ListNode n1 = new ListNode(-9);
        final ListNode n2 = new ListNode(3);
        n1.next = n2;

        final ListNode n3 = new ListNode(5);
        final ListNode n4 = new ListNode(7);
        n3.next = n4;

        ListNode act = MergeTwoSortedLists.mergeTwoLists(n1, n3);

        assertEquals(-9, act.val);
        assertEquals(3, act.next.val);
        assertEquals(5, act.next.next.val);
        assertEquals(7, act.next.next.next.val);
    }
}