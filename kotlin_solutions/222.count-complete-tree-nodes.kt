/*
 * @lc app=leetcode id=222 lang=kotlin
 *
 * [222] Count Complete Tree Nodes
 */

class Solution {fun countNodes(root: TreeNode?): Int = root?.let { 1 + countNodes(it.left) + countNodes(it.right) } ?: 0}

