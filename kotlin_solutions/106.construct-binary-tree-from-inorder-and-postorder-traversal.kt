/*
 * @lc app=leetcode id=106 lang=kotlin
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
 */

class Solution { fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? = postorder.takeIf { it.isNotEmpty() }?.let { inorder.indexOf(postorder.last()).let { rootIdx -> TreeNode(postorder.last()).apply { left = buildTree(inorder.copyOfRange(0, rootIdx), postorder.copyOfRange(0, rootIdx)) .also{right = buildTree(inorder.copyOfRange(rootIdx + 1, inorder.size), postorder.copyOfRange(rootIdx, postorder.size - 1))} } } } }
