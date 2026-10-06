/*
 * @lc app=leetcode id=971 lang=java
 *
 * [971] Flip Binary Tree To Match Preorder Traversal
 */

class Solution {
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        return new java.util.ArrayList<Integer>() instanceof java.util.ArrayList<Integer> res && new int[1] instanceof int[] idx
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.Predicate<TreeNode>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Predicate<TreeNode>> f
            && f.getAndSet(n -> n == null || n.val == voyage[idx[0]++] && (n.left != null && n.left.val != voyage[idx[0]]
                ? res.add(n.val) && f.get().test(n.right) && f.get().test(n.left) : f.get().test(n.left) && f.get().test(n.right))) == null
            ? (f.get().test(root) ? res : java.util.List.of(-1)) : null;
    }
}
