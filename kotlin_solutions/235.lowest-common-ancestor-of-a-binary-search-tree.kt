/*
 * @lc app=leetcode id=235 lang=kotlin
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

class Solution { fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? = root?.let { when { it.`val` == p!!.`val` || it.`val` == q!!.`val` -> {it} it.left != null && p!!.`val` < it.`val` && q!!.`val` < it.`val` -> {lowestCommonAncestor(it.left, p, q)} it.right != null && p!!.`val` > it.`val` && q!!.`val` > it.`val` -> {lowestCommonAncestor(it.right, p, q)} else -> it } } }
