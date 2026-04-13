/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */

class Solution {
    public ListNode sortList(ListNode head) {
        return Stream.iterate(head, Objects::nonNull, n -> n.next)
            .map(n -> n.val)
            .sorted(Comparator.reverseOrder())
            .reduce((ListNode) null, (next, val) -> new ListNode(val, next), (a, b) -> a);
    }
}
