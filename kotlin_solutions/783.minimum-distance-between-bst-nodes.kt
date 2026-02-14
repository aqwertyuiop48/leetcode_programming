/*
 * @lc app=leetcode id=783 lang=kotlin
 *
 * [783] Minimum Distance Between BST Nodes
 */

class Solution { fun minDiffInBST(root: TreeNode?): Int = mutableListOf<Int>().apply { DeepRecursiveFunction<TreeNode?, Unit> { n -> n?.also { callRecursive(it.left).run{add(it.`val`)}.run{callRecursive(it.right)} } }.invoke(root) }.zipWithNext { a, b -> b - a }.minOrNull()!! }
