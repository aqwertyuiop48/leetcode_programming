/*
 * @lc app=leetcode id=897 lang=kotlin
 *
 * [897] Increasing Order Search Tree
 */

class Solution { fun increasingBST(root: TreeNode?, tail: TreeNode? = null): TreeNode? = root?.let { increasingBST(it.left, TreeNode(it.`val`).apply { right = increasingBST(it.right, tail) }) } ?: tail }

