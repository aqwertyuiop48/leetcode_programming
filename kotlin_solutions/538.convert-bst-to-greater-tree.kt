/*
 * @lc app=leetcode id=538 lang=kotlin
 *
 * [538] Convert BST to Greater Tree
 */

class Solution { fun convertBST(root: TreeNode?) = DeepRecursiveFunction<Pair<TreeNode?, Int>, Int> { (node, sum) -> node?.let { n -> callRecursive(n.right to sum).let { rightSum -> (rightSum + n.`val`).also { n.`val` = it }.let { newVal -> callRecursive(n.left to newVal) } } } ?: sum }(root to 0).run { root } }

