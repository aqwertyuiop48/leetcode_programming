/*
 * @lc app=leetcode id=671 lang=kotlin
 *
 * [671] Second Minimum Node In a Binary Tree
 */

class Solution { fun findSecondMinimumValue(root: TreeNode?): Int = DeepRecursiveFunction<TreeNode?, Set<Int>> { it?.let { setOf(it.`val`) + callRecursive(it.left) + callRecursive(it.right) } ?: emptySet() }(root) .sorted().getOrNull(1) ?: -1 }

