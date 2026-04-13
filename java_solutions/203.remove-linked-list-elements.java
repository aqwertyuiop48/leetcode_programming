/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        return head == null ? null : (head.val == val ? removeElements(head.next, val) : new ListNode(head.val, removeElements(head.next, val)));
    }
}
