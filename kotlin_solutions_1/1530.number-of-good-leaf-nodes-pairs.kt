/*
 * @lc app=leetcode id=1530 lang=kotlin
 *
 * [1530] Number of Good Leaf Nodes Pairs
 */

class Solution { fun countPairs(root: TreeNode?, distance: Int): Int = IntArray(1).also { ans -> DeepRecursiveFunction<TreeNode?, IntArray> { node -> node?.run { if (left == null && right == null) intArrayOf(1) else callRecursive(left).let { l -> callRecursive(right).let { r -> l.forEach { d1 -> r.forEach { d2 -> if (d1 + d2 <= distance) ans[0] = ans[0] + 1 } }.let { (l + r).map { it + 1 }.filter { it <= distance }.toIntArray() } } } } ?: intArrayOf() }(root) }[0] }