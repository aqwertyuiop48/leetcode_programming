/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return Stream.of(Stream.iterate(head, Objects::nonNull, n -> n.next).map(n -> n.val).collect(Collectors.toList())).peek(l -> Collections.reverse(l.subList(left - 1, right))).peek(Collections::reverse).flatMap(List::stream).reduce((ListNode) null, (next, val) -> new ListNode(val, next), (a, b) -> a);
    }
}
