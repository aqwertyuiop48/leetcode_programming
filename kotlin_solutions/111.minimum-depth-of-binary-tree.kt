/*
 * @lc app=leetcode id=111 lang=kotlin
 *
 * [111] Minimum Depth of Binary Tree
 */

class Solution { fun minDepth(root: TreeNode?): Int = root?.let { when { it.left == null && it.right == null -> {1} it.left == null -> {minDepth(it.right) + 1} it.right == null -> {minDepth(it.left) + 1} else -> minOf(minDepth(it.left), minDepth(it.right)) + 1 } } ?: 0 }
