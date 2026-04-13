/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        return root == null ? null : IntStream.range(0, 1) .mapToObj(i -> root.left) .peek(oldLeft -> root.left = invertTree(root.right)) .peek(oldLeft -> root.right = invertTree(oldLeft)) .map(oldLeft -> root) .findFirst() .get();
    }
}
