/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
 */

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, java.util.List<Integer>>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, java.util.List<Integer>>> f
            && f.getAndSet(n -> n == null ? java.util.List.<Integer>of() : n.left == null && n.right == null ? java.util.List.of(n.val)
                : java.util.stream.Stream.concat(f.get().apply(n.left).stream(), f.get().apply(n.right).stream()).toList()) == null
            && f.get().apply(root1).equals(f.get().apply(root2));
    }
}
