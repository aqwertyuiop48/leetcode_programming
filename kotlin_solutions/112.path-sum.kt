/*
 * @lc app=leetcode id=112 lang=kotlin
 *
 * [112] Path Sum
 */

class Solution { fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean = root?.let { (it.left == null && it.right == null && it.`val` == targetSum) || hasPathSum(it.left, targetSum - it.`val`) || hasPathSum(it.right, targetSum - it.`val`) } ?: false }

