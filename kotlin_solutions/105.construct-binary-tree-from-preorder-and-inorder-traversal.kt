/*
 * @lc app=leetcode id=105 lang=kotlin
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

class Solution { fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? = preorder.takeIf { it.isNotEmpty() }?.let { inorder.indexOf(preorder[0]).let { rootIdx -> TreeNode(preorder[0]).apply { left = buildTree(preorder.copyOfRange(1, rootIdx + 1), inorder.copyOfRange(0, rootIdx)) .also{right = buildTree(preorder.copyOfRange(rootIdx + 1, preorder.size), inorder.copyOfRange(rootIdx + 1, inorder.size))} } } } }

