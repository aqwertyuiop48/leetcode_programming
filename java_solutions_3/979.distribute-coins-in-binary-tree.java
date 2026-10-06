/*
 * @lc app=leetcode id=979 lang=java
 *
 * [979] Distribute Coins in Binary Tree
 */

class Solution {
    public int distributeCoins(TreeNode root) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, int[]>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, int[]>> f
            && f.getAndSet(n -> n == null ? new int[2] : java.util.Optional.of(f.get().apply(n.left))
                .map(l -> java.util.Optional.of(f.get().apply(n.right)).map(r -> new int[]{n.val + l[0] + r[0] - 1, l[1] + r[1] + Math.abs(l[0]) + Math.abs(r[0])}).get()).get()) == null
            ? f.get().apply(root)[1] : 0;
    }
}
