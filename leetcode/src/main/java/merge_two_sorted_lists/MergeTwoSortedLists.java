package merge_two_sorted_lists;

import java.util.Objects;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * <p>
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
class MergeTwoSortedLists {

    static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
        if (Objects.isNull(n1)) {
            return n2;
        }

        if (Objects.isNull(n2)) {
            return n1;
        }

        if (n1.val < n2.val) {
            n1.next = mergeTwoLists(n2, n1.next);
            return n1;

        } else {
            n2.next = mergeTwoLists(n1, n2.next);
            return n2;
        }
    }

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
