/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
 */

record Solution() {
    public TreeNode searchBST(TreeNode root, int val) {
        return root == null || root.val == val ? root : val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
