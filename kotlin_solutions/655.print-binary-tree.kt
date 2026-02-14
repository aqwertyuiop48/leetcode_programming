/*
 * @lc app=leetcode id=655 lang=kotlin
 *
 * [655] Print Binary Tree
 */

class Solution { fun printTree(root: TreeNode?): List<List<String>> = (DeepRecursiveFunction<TreeNode?, Int> { it?.let { 1 + maxOf(callRecursive(it.left), callRecursive(it.right)) } ?: 0 }(root)).let { h -> List(h) { MutableList((1 shl h) - 1) { "" } }.also { res -> DeepRecursiveFunction<Triple<TreeNode?, Int, Int>, Unit> { (node, r, c) -> node?.also { n -> res[r][c] = n.`val`.toString().also { (1 shl (h - r - 2)).also { offset -> callRecursive(Triple(n.left, r + 1, c - offset)).run { callRecursive(Triple(n.right, r + 1, c + offset)) } }} } }(Triple(root, 0, ((1 shl h) - 1) / 2)) } } }
