/*
 * @lc app=leetcode id=129 lang=kotlin
 *
 * [129] Sum Root to Leaf Numbers
 */

class Solution { fun sumNumbers(root: TreeNode?): Int = DeepRecursiveFunction<Pair<TreeNode?, Int>, Int> { (node, sum) -> node?.let { (sum * 10 + it.`val`).let { newSum -> if (it.left == null && it.right == null) newSum else callRecursive(it.left to newSum) + callRecursive(it.right to newSum) } } ?: 0 }.invoke(root to 0) }

