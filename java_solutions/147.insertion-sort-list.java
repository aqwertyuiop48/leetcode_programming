/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
 */

class Solution {
    public ListNode insertionSortList(ListNode head) {
        return Stream.iterate(head, Objects::nonNull, n -> n.next)
            .map(n -> n.val)
            .sorted(Comparator.reverseOrder())
            .reduce((ListNode) null, (next, val) -> new ListNode(val, next), (a, b) -> a);
    }
}
