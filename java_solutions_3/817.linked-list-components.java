/*
 * @lc app=leetcode id=817 lang=java
 *
 * [817] Linked List Components
 */

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        return java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Integer> st
            ? (int) java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).filter(n -> st.contains(n.val) && (n.next == null || !st.contains(n.next.val))).count() : 0;
    }
}
