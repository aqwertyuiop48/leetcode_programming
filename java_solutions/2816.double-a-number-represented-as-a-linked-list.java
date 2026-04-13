/*
 * @lc app=leetcode id=2816 lang=java
 *
 * [2816] Double a Number Represented as a Linked List
 */

class Solution {
    public ListNode doubleIt(ListNode head) {
        return Stream.of(head.val > 4 ? new ListNode(0, head) : head)
            .peek(h -> Stream.iterate(h, n -> n != null, n -> n.next)
                .forEach(n -> n.val = ((n.val * 2) % 10) + (n.next != null && n.next.val > 4 ? 1 : 0)))
            .findFirst().get();
    }
}
