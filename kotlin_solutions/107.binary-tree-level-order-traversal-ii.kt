/*
 * @lc app=leetcode id=107 lang=kotlin
 *
 * [107] Binary Tree Level Order Traversal II
 */

class Solution { fun levelOrderBottom(root: TreeNode?): List<List<Int>> = root?.let { generateSequence(listOf(it)) { level -> level.flatMap { listOfNotNull(it.left, it.right) }.takeIf { it.isNotEmpty() } }.map { it.map { node -> node.`val` } }.toList().reversed() } ?: emptyList() }

