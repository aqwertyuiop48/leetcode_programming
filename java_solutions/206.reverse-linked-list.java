/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        return Stream.iterate(head, Objects::nonNull, n -> n.next) .map(n -> n.val) .collect(Collectors.collectingAndThen( Collectors.toList(), list -> list.stream() .reduce(null, (nextNode, val) -> new ListNode(val, nextNode), (node1, node2) -> node1) ));
    }
}
