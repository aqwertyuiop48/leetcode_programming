/*
 * @lc app=leetcode id=1290 lang=java
 *
 * [1290] Convert Binary Number in a Linked List to Integer
 */

class Solution {
    public int getDecimalValue(ListNode head) {
        return Stream.iterate(head, node -> node != null, node -> node.next)
            .map(node -> node.val)
            .reduce(0, (accumulator, bit) -> (accumulator << 1) | bit);
    }
}
