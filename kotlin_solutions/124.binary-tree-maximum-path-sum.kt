/*
 * @lc app=leetcode id=124 lang=kotlin
 *
 * [124] Binary Tree Maximum Path Sum
 */

class Solution {fun maxPathSum(root: TreeNode?) = object { lateinit var post: (TreeNode?) -> Pair<Int, Int> }.apply { post = { n -> n?.let { post(it.left).let { (lm, lp) -> post(it.right).let { (rm, rp) -> Pair(maxOf(lm, rm, lp + rp + it.`val`), maxOf(0, it.`val` + maxOf(lp, rp))) } } } ?: Pair(Int.MIN_VALUE, 0) } }.run { post(root).first }}

