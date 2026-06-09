/*
 * @lc app=leetcode id=450 lang=java
 *
 * [450] Delete Node in a BST
 */

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        return root == null ? null : key < root.val ? java.util.stream.Stream.of(root).peek(r -> r.left = deleteNode(r.left, key)).findFirst().get() : key > root.val ? java.util.stream.Stream.of(root).peek(r -> r.right = deleteNode(r.right, key)).findFirst().get() : root.left == null ? root.right : root.right == null ? root.left : java.util.stream.Stream.of(root).peek(r -> r.val = java.util.stream.Stream.iterate(r.right, n -> n != null, n -> n.left).reduce((a, b) -> b).get().val).peek(r -> r.right = deleteNode(r.right, r.val)).findFirst().get();
    }
}
