/*
 * @lc app=leetcode id=94 lang=kotlin
 *
 * [94] Binary Tree Inorder Traversal
 */

class Solution { fun inorderTraversal(root: TreeNode?): List<Int> = mutableListOf<Int>().also { res -> DeepRecursiveFunction<TreeNode?, Unit> { node -> node?.also { callRecursive(it.left) } ?.also { res.add(it.`val`) } ?.also { callRecursive(it.right) } }.invoke(root) } }
