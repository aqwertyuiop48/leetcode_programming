/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return root == null || root == p || root == q ? root : java.util.stream.Stream.of(0).map(_v -> new TreeNode[]{lowestCommonAncestor(root.left, p, q), lowestCommonAncestor(root.right, p, q)}).map(a -> new TreeNode[]{a[0] != null && a[1] != null ? root : a[0] != null ? a[0] : a[1]}).findFirst().get()[0];
    }
}
// @lc code=end
