/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
 */

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.BiPredicate<TreeNode, TreeNode>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.BiPredicate<TreeNode, TreeNode>> same
            && same.getAndSet((p, q) -> p == null || q == null ? p == q : p.val == q.val && same.get().test(p.left, q.left) && same.get().test(p.right, q.right)) == null
            && (root != null && (same.get().test(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)));
    }
}
