/*
 * @lc app=leetcode id=103 lang=kotlin
 *
 * [103] Binary Tree Zigzag Level Order Traversal
 */

class Solution { fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> = root?.let { generateSequence(listOf(it) to false) { (level, reverse) -> level.flatMap { listOfNotNull(it.left, it.right) }.takeIf { it.isNotEmpty() }?.let { it to !reverse } }.map { (level, reverse) -> level.map { it.`val` }.let { if (reverse) it.reversed() else it } }.toList() } ?: emptyList() }

