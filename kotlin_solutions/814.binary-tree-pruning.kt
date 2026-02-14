/*
 * @lc app=leetcode id=814 lang=kotlin
 *
 * [814] Binary Tree Pruning
 */

class Solution { fun pruneTree(root: TreeNode?): TreeNode? = root?.let { node -> node.apply { left = pruneTree(left).also{right = pruneTree(right)} } .takeIf { it.left != null || it.right != null || it.`val` != 0 } }}