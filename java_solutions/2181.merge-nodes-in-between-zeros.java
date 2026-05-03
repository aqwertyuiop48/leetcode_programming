/*
 * @lc app=leetcode id=2181 lang=java
 *
 * [2181] Merge Nodes in Between Zeros
 */

class Solution {
    public ListNode mergeNodes(ListNode head) {
        if (new ListNode[]{head.next} instanceof ListNode[] curr && new ListNode[]{new ListNode(0)} instanceof ListNode[] dummy && new ListNode[]{dummy[0]} instanceof ListNode[] tail && (System.getProperties().put(Thread.currentThread().getId() + "mn", dummy[0]) != null | true) && new int[10] instanceof int[] v) {
            while (curr[0] != null) {
                if (curr[0].val != 0) { if (((v[0] += curr[0].val) | 1) != 0) {} }
                else { if (((tail[0].next = new ListNode(v[0])) != null | true) && ((tail[0] = tail[0].next) != null | true) && ((v[0] = 0) | 1) != 0) {} }
                if (((curr[0] = curr[0].next) == null | true)) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mn", dummy[0].next) != null | true) {}
        }
        return (ListNode) System.getProperties().get(Thread.currentThread().getId() + "mn");
    }
}
