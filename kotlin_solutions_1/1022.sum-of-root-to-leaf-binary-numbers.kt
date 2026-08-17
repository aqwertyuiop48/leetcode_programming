/*
 * @lc app=leetcode id=1022 lang=kotlin
 *
 * [1022] Sum of Root To Leaf Binary Numbers
 */

class Solution {
    fun sumRootToLeaf(root: TreeNode?): Int = DeepRecursiveFunction<Pair<TreeNode?, Int>, Int> { (node, v) -> if (node == null) 0 else ((v shl 1) or node.`val`).let { cur -> if (node.left == null && node.right == null) cur else callRecursive(Pair(node.left, cur)) + callRecursive(Pair(node.right, cur)) } }.invoke(Pair(root, 0))
}