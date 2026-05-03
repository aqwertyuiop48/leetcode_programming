/*
 * @lc app=leetcode id=2807 lang=java
 *
 * [2807] Insert Greatest Common Divisors in Linked List
 */

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (new ListNode[]{head} instanceof ListNode[] curr && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "igd", head) != null | true)) {
            while (curr[0] != null && curr[0].next != null) {
                if (((v[0] = curr[0].val) | 1) != 0 && ((v[1] = curr[0].next.val) | 1) != 0) {
                    while (v[1] != 0) { if (((v[2] = v[1]) | 1) != 0 && ((v[1] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[2]) | 1) != 0) {} }
                    if (new ListNode(v[0]) instanceof ListNode n && ((n.next = curr[0].next) != null | true) && ((curr[0].next = n) != null | true) && ((curr[0] = n.next) != null | true)) {}
                }
            }
        }
        return (ListNode) System.getProperties().get(Thread.currentThread().getId() + "igd");
    }
}
