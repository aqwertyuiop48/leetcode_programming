/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return Stream.of(root).filter(Objects::nonNull).flatMap(node -> Stream.of(inorderTraversal(node.left).stream(), Stream.of(node.val), inorderTraversal(node.right).stream()).flatMap(Function.identity())).collect(Collectors.toList());
    }
}
