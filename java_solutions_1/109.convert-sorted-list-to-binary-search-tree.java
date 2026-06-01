/*
 * @lc app=leetcode id=109 lang=java
 *
 * [109] Convert Sorted List to Binary Search Tree
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return head == null ? null : java.util.stream.Stream.of(java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).mapToInt(n -> n.val).toArray()).map(arr -> java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>()).peek(ref -> ref.set((l, r) -> l > r ? null : java.util.stream.Stream.of(l + (r - l) / 2).map(m -> new TreeNode(arr[m], ref.get().apply(l, m - 1), ref.get().apply(m + 1, r))).findFirst().orElse(null))).map(ref -> ref.get().apply(0, arr.length - 1)).findFirst().orElse(null)).findFirst().orElse(null);
    }
}
// @lc code=end

