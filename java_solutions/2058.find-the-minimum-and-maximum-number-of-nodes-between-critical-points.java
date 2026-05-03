/*
 * @lc app=leetcode id=2058 lang=java
 *
 * [2058] Find the Minimum and Maximum Number of Nodes Between Critical Points
 */

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nbc", new int[]{-1, -1}) != null | true) && head != null && head.next != null && head.next.next != null) {
            if (new ListNode[]{head} instanceof ListNode[] p && new ListNode[]{head.next} instanceof ListNode[] c && new ListNode[]{head.next.next} instanceof ListNode[] n && ((v[0] = 1) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = -1) | 1) != 0 && ((v[3] = 2000000) | 1) != 0) {
                while (n[0] != null) {
                    if ((c[0].val > p[0].val && c[0].val > n[0].val) || (c[0].val < p[0].val && c[0].val < n[0].val)) {
                        if (v[1] == -1) { if (((v[1] = v[0]) | 1) != 0) {} }
                        else { if (v[0] - v[2] < v[3]) { if (((v[3] = v[0] - v[2]) | 1) != 0) {} } }
                        if (((v[2] = v[0]) | 1) != 0) {}
                    }
                    if (((p[0] = c[0]) != null | true) && ((c[0] = n[0]) != null | true) && ((n[0] = n[0].next) == null | true) && ((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] != -1 && v[2] != -1 && v[1] != v[2]) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "nbc", new int[]{v[3], v[2] - v[1]}) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "nbc");
    }
}
