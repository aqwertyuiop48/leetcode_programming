/*
 * @lc app=leetcode id=2487 lang=java
 *
 * [2487] Remove Nodes From Linked List
 */

class Solution {
    public ListNode removeNodes(ListNode head) {
        return (head == null || head.next == null) ? head : 
            (head.next = removeNodes(head.next)).val > head.val ? head.next : head;
    }
}
