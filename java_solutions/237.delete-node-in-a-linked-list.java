/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
 */

class Solution {
    public void deleteNode(ListNode node) {
        node.val = (node.next = (node.val = node.next.val) == node.next.val ? node.next.next : null) == null ? node.val : node.val;
    }
}
