/*
 * @lc app=leetcode id=951 lang=java
 *
 * [951] Flip Equivalent Binary Trees
 */

class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return root1 == null || root2 == null ? root1 == root2
            : root1.val == root2.val && (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) || flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}
