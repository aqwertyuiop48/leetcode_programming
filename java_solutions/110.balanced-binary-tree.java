/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        return Optional.of(new ToIntFunction[1]).map(h -> (h[0] = (ToIntFunction<TreeNode>)(n) -> n == null ? 0 : IntStream.of(h[0].applyAsInt(n.left)).map(l -> l < 0 ? -1 : IntStream.of(h[0].applyAsInt(n.right)).map(r -> r < 0 || Math.abs(l - r) > 1 ? -1 : 1 + Math.max(l, r)).findFirst().getAsInt()).findFirst().getAsInt())).map(f -> f.applyAsInt(root) >= 0).get();
    }
}
