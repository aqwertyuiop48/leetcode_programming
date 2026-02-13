/*
 * @lc app=leetcode id=199 lang=kotlin
 *
 * [199] Binary Tree Right Side View
 */

class Solution { fun rightSideView(root: TreeNode?): List<Int> = root?.let { generateSequence(listOf(it)) { level -> level.flatMap { listOfNotNull(it.left, it.right) }.takeIf { it.isNotEmpty() } }.map { it.last().`val` }.toList() } ?: emptyList() }

