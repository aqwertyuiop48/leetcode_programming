/*
 * @lc app=leetcode id=102 lang=kotlin
 *
 * [102] Binary Tree Level Order Traversal
 */

class Solution{fun levelOrder(root: TreeNode?): List<List<Int>> = root?.let{generateSequence(listOf(it)) { level ->level.flatMap { listOfNotNull(it.left, it.right) }.takeIf { it.isNotEmpty() }}.map { it.map { node -> node.`val` } }.toList()} ?: emptyList()}
