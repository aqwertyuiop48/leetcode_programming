/*
 * @lc app=leetcode id=2583 lang=kotlin
 *
 * [2583] Kth Largest Sum in a Binary Tree
 */

class Solution {fun kthLargestLevelSum(root: TreeNode?, k: Int) = root?.let { generateSequence(listOf(it)) { level -> level.flatMap { listOfNotNull(it.left, it.right) }.takeIf { it.isNotEmpty() } }.map { level -> level.sumOf { it.`val`.toLong() } }.sortedDescending().elementAtOrNull(k - 1) ?: -1L } ?: 0L}

