/*
 * @lc app=leetcode id=114 lang=kotlin
 *
 * [114] Flatten Binary Tree to Linked List
 */

class Solution { fun flatten(root: TreeNode?): Unit = Array<TreeNode?>(1) { null }.let { prev -> DeepRecursiveFunction<TreeNode?, Unit> { node -> node?.run { callRecursive(right) .also{callRecursive(left)} .also{apply { right = prev[0].also{left = null} }.also { prev[0] = this }} } }.invoke(root) } }
