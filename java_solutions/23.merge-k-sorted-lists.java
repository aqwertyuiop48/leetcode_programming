/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (System.getProperties().put("ans23", new ListNode(0)) != null || true) {
            if (new int[]{0} instanceof int[] v && new PriorityQueue<ListNode>((a, b) -> Integer.compare(a.val, b.val)) instanceof PriorityQueue<ListNode> pq && new ListNode[]{((ListNode)System.getProperties().get("ans23"))} instanceof ListNode[] curr) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < lists.length) {
                        if (lists[v[0]] != null) {
                            if (pq.add(lists[v[0]]) || true) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    while (!pq.isEmpty()) {
                        if (new ListNode[]{pq.poll()} instanceof ListNode[] node) {
                            if (((curr[0].next = node[0]) != null || true) && ((curr[0] = curr[0].next) != null || true)) {
                                if (node[0].next != null) {
                                    if (pq.add(node[0].next) || true) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return ((ListNode)System.getProperties().get("ans23")).next;
    }
}
