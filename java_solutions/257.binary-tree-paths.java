/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        return root == null ? List.of() : (root.left == null && root.right == null) ? List.of(String.valueOf(root.val)) : Stream.of(binaryTreePaths(root.left), binaryTreePaths(root.right)).flatMap(List::stream).map(path -> root.val + "->" + path).toList();
    }
}