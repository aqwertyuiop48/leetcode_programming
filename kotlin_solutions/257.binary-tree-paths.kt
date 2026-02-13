/*
 * @lc app=leetcode id=257 lang=kotlin
 *
 * [257] Binary Tree Paths
 */

class Solution {fun binaryTreePaths(root: TreeNode?) = mutableListOf<String>().also { result -> generateSequence(listOf(root to "")) { queue -> queue.flatMap { (node, path) -> node?.run { (if (path.isEmpty()) "$`val`" else "$path->$`val`").let { updatedPath -> if (left == null && right == null) result.add(updatedPath).let { emptyList() } else listOfNotNull(left to updatedPath, right to updatedPath).filter { it.first != null } } } ?: emptyList() }.takeIf { it.isNotEmpty() } }.takeWhile { it.isNotEmpty() }.toList() }}
