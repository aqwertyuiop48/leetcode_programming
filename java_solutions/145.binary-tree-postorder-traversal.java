/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
 */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        return root == null ? Collections.emptyList() : Stream.concat(Stream.concat(postorderTraversal(root.left).stream(), postorderTraversal(root.right).stream()), Stream.of(root.val)).toList();
    }
}
