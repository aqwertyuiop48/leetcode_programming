/*
 * @lc app=leetcode id=617 lang=kotlin
 *
 * [617] Merge Two Binary Trees
 */

class Solution { fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? = when { root1 == null -> {root2} root2 == null -> {root1} else -> TreeNode(root1.`val` + root2.`val`).apply { left = mergeTrees(root1.left, root2.left).also{right = mergeTrees(root1.right, root2.right)} } } }

