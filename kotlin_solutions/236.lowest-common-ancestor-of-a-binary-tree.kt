/*
 * @lc app=leetcode id=236 lang=kotlin
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

class Solution {fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? = root?.let { if (it == p || it == q) it else lowestCommonAncestor(it.left, p, q).let { left -> lowestCommonAncestor(it.right, p, q).let { right -> if (left != null && right != null) root else left ?: right } } }}

