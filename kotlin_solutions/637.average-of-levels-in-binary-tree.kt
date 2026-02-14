/*
 * @lc app=leetcode id=637 lang=kotlin
 *
 * [637] Average of Levels in Binary Tree
 */

class Solution { fun averageOfLevels(root: TreeNode?): DoubleArray = generateSequence(listOf(root).filterNotNull()) { level -> level.flatMap { listOfNotNull(it.left, it.right) }.takeIf { it.isNotEmpty() } }.map { it.map { node -> node.`val` }.average() }.toList().toDoubleArray() }
