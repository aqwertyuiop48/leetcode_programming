/*
 * @lc app=leetcode id=109 lang=java
 *
 * [109] Convert Sorted List to Binary Search Tree
 */

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return java.util.stream.Stream.of(java.util.stream.Stream.<ListNode>iterate(head, n -> n != null, n -> n.next).mapToInt(n -> n.val).toArray()).map(nums -> java.util.stream.Stream.<java.util.function.BiFunction<Integer, Integer, TreeNode>[]>of(new java.util.function.BiFunction[1]).map(f -> java.util.stream.Stream.of(f[0] = (java.util.function.BiFunction<Integer, Integer, TreeNode>) (l, r) -> l > r ? null : new TreeNode(nums[(l + r) / 2], f[0].apply(l, (l + r) / 2 - 1), f[0].apply((l + r) / 2 + 1, r))).findFirst().get()).findFirst().get().apply(0, nums.length - 1)).findFirst().orElse(null);
    }
}
