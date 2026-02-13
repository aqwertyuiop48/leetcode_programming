/*
 * @lc app=leetcode id=113 lang=kotlin
 *
 * [113] Path Sum II
 */

class Solution { fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> = mutableListOf<List<Int>>().also { result -> DeepRecursiveFunction<Triple<TreeNode?, Int, MutableList<Int>>, Unit> { (node, sum, path) -> node?.let { path.add(it.`val`).run{ if (it.left == null && it.right == null && sum == it.`val`) result.add(path.toList()) else {callRecursive(Triple(it.left, sum - it.`val`, path)).apply { callRecursive(Triple(it.right, sum - it.`val`, path)) }}.also{path.removeLast()} }} }.invoke(Triple(root, targetSum, mutableListOf())) } }

