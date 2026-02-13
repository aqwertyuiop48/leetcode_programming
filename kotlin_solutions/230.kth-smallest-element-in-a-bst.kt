/*
 * @lc app=leetcode id=230 lang=kotlin
 *
 * [230] Kth Smallest Element in a BST
 */

class Solution { fun kthSmallest(root: TreeNode?, k: Int): Int { return toList(root).sorted()[k - 1] } private fun toList(node: TreeNode?): List<Int> { return node?.let { listOf(it.`val`) + toList(it.left) + toList(it.right) } ?: emptyList() } }

