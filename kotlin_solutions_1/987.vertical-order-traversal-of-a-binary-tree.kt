/*
 * @lc app=leetcode id=987 lang=kotlin
 *
 * [987] Vertical Order Traversal of a Binary Tree
 */

class Solution {
    fun verticalTraversal(root: TreeNode?): List<List<Int>> = DeepRecursiveFunction<Triple<TreeNode?, Int, Int>, List<Triple<Int, Int, Int>>> { (node, col, row) -> if (node == null) emptyList() else listOf(Triple(col, row, node.`val`)) + callRecursive(Triple(node.left, col - 1, row + 1)) + callRecursive(Triple(node.right, col + 1, row + 1)) }.invoke(Triple(root, 0, 0)).sortedWith(compareBy({ it.first }, { it.second }, { it.third })).groupBy({ it.first }, { it.third }).values.toList()
}