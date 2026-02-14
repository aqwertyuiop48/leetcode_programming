/*
 * @lc app=leetcode id=662 lang=kotlin
 *
 * [662] Maximum Width of Binary Tree
 */

class Solution { fun widthOfBinaryTree(root: TreeNode?): Int = generateSequence(listOf(root to 0L)) { level -> level.flatMap { (node, pos) -> listOfNotNull(node?.left?.let { it to pos * 2 }, node?.right?.let { it to pos * 2 + 1 }) }.takeIf { it.isNotEmpty() } }.maxOf { (it.last().second - it.first().second + 1).toInt() } }
