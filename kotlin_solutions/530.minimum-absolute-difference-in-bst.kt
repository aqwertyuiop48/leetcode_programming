/*
 * @lc app=leetcode id=530 lang=kotlin
 *
 * [530] Minimum Absolute Difference in BST
 */

class Solution { fun getMinimumDifference(root: TreeNode?) = DeepRecursiveFunction<TreeNode?, List<Int>> { node -> node?.let { (callRecursive(it.left) + it.`val` + callRecursive(it.right)) } ?: emptyList() }(root).sorted().zipWithNext { a, b -> b - a }.min() }
