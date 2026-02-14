/*
 * @lc app=leetcode id=450 lang=kotlin
 *
 * [450] Delete Node in a BST
 */

class Solution { fun deleteNode(root: TreeNode?, key: Int): TreeNode? = root?.let { node -> when { key < node.`val` -> {node.apply { left = deleteNode(left, key) }} key > node.`val` -> {node.apply { right = deleteNode(right, key) }} node.left == null -> {node.right} node.right == null -> {node.left} else -> generateSequence(node.right) { it.left }.last().let { min -> node.apply { `val` = min.`val`.also{right = deleteNode(right, min.`val`) }} } } } }

