/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// semicolons : 1
class Solution {
    public int minDepth(TreeNode root) {
    return Optional.ofNullable(root) .map(n -> 1 + Stream.of(n.left, n.right) .filter(Objects::nonNull) .mapToInt(this::minDepth) .min() .orElse(0)) .orElse(0);
}
}
