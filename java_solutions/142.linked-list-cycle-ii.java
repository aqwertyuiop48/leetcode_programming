/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        return java.util.stream.Stream.of(new java.util.IdentityHashMap<ListNode, Boolean>()).flatMap(v -> java.util.stream.Stream.<ListNode>iterate(head, n -> n != null, n -> n.next).filter(n -> v.put(n, true) != null)).findFirst().orElse(null);
    }
}
