/*
 * @lc app=leetcode id=669 lang=kotlin
 *
 * [669] Trim a Binary Search Tree
 */

class Solution { fun trimBST(root: TreeNode?, low: Int, high: Int): TreeNode? = DeepRecursiveFunction<TreeNode?, TreeNode?> { node -> node?.let { when { it.`val` < low -> {callRecursive(it.right)} it.`val` > high -> {callRecursive(it.left)} else -> it.apply { left = callRecursive(left).also{right = callRecursive(right) }} } } }(root) }

