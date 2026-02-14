/*
 * @lc app=leetcode id=687 lang=kotlin
 *
 * [687] Longest Univalue Path
 */

class Solution { fun longestUnivaluePath(root: TreeNode?): Int = DeepRecursiveFunction<TreeNode?, Pair<Int, Int>> { node -> node?.let { callRecursive(it.left).let { (lMax, lPath) -> callRecursive(it.right).let { (rMax, rPath) -> (if (it.left?.`val` == it.`val`) lPath + 1 else 0).let { l -> (if (it.right?.`val` == it.`val`) rPath + 1 else 0).let { r -> maxOf(lMax, rMax, l + r) to maxOf(l, r) } } } } } ?: (0 to 0) }(root).first }

