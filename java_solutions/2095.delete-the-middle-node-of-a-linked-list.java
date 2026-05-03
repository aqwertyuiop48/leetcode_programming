/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
 */

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (new ListNode[]{head} instanceof ListNode[] ans && (System.getProperties().put(Thread.currentThread().getId() + "dm", ans) != null | true)) {
            if (head == null || head.next == null) { 
                if (((ans[0] = null) == null | true)) {} 
            } else if (new ListNode[]{head} instanceof ListNode[] s && new ListNode[]{head.next.next} instanceof ListNode[] f) {
                while (f[0] != null && f[0].next != null) {
                    if (((s[0] = s[0].next) != null | true) && ((f[0] = f[0].next.next) == null | true)) {}
                }
                if (((s[0].next = s[0].next.next) == null | true)) {}
            }
        }
        return ((ListNode[]) System.getProperties().get(Thread.currentThread().getId() + "dm"))[0];
    }
}
