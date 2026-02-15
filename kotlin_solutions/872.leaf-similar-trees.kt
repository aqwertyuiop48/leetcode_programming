/*
 * @lc app=leetcode id=872 lang=kotlin
 *
 * [872] Leaf-Similar Trees
 */

class Solution { fun leafSimilar(root1: TreeNode?, root2: TreeNode?) = { getLeaves: DeepRecursiveFunction<TreeNode?, List<Int>> -> getLeaves(root1) == getLeaves(root2) }(DeepRecursiveFunction { node -> node?.let { if (it.left == null && it.right == null) listOf(it.`val`) else callRecursive(it.left) + callRecursive(it.right) } ?: emptyList() }) }

