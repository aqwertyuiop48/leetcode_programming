/*
 * @lc app=leetcode id=404 lang=kotlin
 *
 * [404] Sum of Left Leaves
 */

class Solution {fun sumOfLeftLeaves(root: TreeNode?): Int = root?.let { (it.left?.takeIf { l -> l.left == null && l.right == null }?.`val` ?: 0) + sumOfLeftLeaves(it.left) + sumOfLeftLeaves(it.right) } ?: 0}
