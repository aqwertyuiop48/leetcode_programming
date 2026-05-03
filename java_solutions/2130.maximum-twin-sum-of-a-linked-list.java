/*
 * @lc app=leetcode id=2130 lang=java
 *
 * [2130] Maximum Twin Sum of a Linked List
 */

class Solution {
    public int pairSum(ListNode head) {
        if (new int[100005] instanceof int[] arr && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ps", 0) != null | true) && new ListNode[]{head} instanceof ListNode[] curr && ((v[0] = 0) | 1) != 0) {
            while (curr[0] != null) { if (((arr[v[0]++] = curr[0].val) | 1) != 0 && ((curr[0] = curr[0].next) == null | true)) {} }
            if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[1] < v[0] / 2) {
                    if (arr[v[1]] + arr[v[0] - 1 - v[1]] > v[2]) { if (((v[2] = arr[v[1]] + arr[v[0] - 1 - v[1]]) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ps", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ps");
    }
}
