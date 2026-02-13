/*
 * @lc app=leetcode id=144 lang=kotlin
 *
 * [144] Binary Tree Preorder Traversal
 */

class Solution {fun preorderTraversal(root: TreeNode?): List<Int> =root?.let { listOf(it.`val`) + preorderTraversal(it.left) + preorderTraversal(it.right) } ?: emptyList()}
