/*
 * @lc app=leetcode id=145 lang=kotlin
 *
 * [145] Binary Tree Postorder Traversal
 */

class Solution {fun postorderTraversal(root: TreeNode?): List<Int> = when (root) {null -> {emptyList()} else -> postorderTraversal(root.left) + postorderTraversal(root.right) + root.`val`}}
