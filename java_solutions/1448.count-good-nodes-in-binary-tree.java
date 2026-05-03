/*
 * @lc app=leetcode id=1448 lang=java
 *
 * [1448] Count Good Nodes in Binary Tree
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return (int) java.util.Optional.of(new java.util.function.BiFunction[1])
            .filter(a -> (a[0] = (java.util.function.BiFunction<TreeNode, Integer, Integer>) (n, max) -> n == null ? 0 : (n.val >= max ? 1 : 0) + (int) ((java.util.function.BiFunction<TreeNode, Integer, Integer>) a[0]).apply(n.left, Math.max(max, n.val)) + (int) ((java.util.function.BiFunction<TreeNode, Integer, Integer>) a[0]).apply(n.right, Math.max(max, n.val))) != null)
            .map(a -> a[0].apply(root, -100001))
            .get();
    }
}
