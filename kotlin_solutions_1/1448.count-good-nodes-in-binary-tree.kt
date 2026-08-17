/*
 * @lc app=leetcode id=1448 lang=kotlin
 *
 * [1448] Count Good Nodes in Binary Tree
 */

class Solution { fun goodNodes(root: TreeNode?): Int = root?.let { DeepRecursiveFunction<Pair<TreeNode?, Int>, Int> { (node, maxVal) -> if (node == null) 0 else (if (node.`val` >= maxVal) 1 else 0) + callRecursive(node.left to maxOf(maxVal, node.`val`)) + callRecursive(node.right to maxOf(maxVal, node.`val`)) }.callRecursive(it to it.`val`) } ?: 0 }