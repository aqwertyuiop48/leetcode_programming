/*
 * @lc app=leetcode id=437 lang=kotlin
 *
 * [437] Path Sum III
 */

class Solution {fun pathSum(root: TreeNode?, targetSum: Int): Int = root?.let { object { fun getSumCount(node: TreeNode?, sum: Long): Int = node?.let { n -> (sum + n.`val`).let { curSum -> (if (targetSum.toLong() == curSum) 1 else 0) + getSumCount(n.left, curSum) + getSumCount(n.right, curSum) } } ?: 0 }.run { getSumCount(root, 0L) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum) } } ?: 0}
