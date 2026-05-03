/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        return java.util.stream.Stream.of(new java.util.IdentityHashMap<ListNode, Boolean>()).map(v -> java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).anyMatch(n -> v.put(n, true) != null)).findFirst().get();
    }
}
