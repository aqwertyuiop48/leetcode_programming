/*
 * @lc app=leetcode id=104 lang=kotlin
 *
 * [104] Maximum Depth of Binary Tree
 */

class Solution {fun maxDepth(root: TreeNode?): Int =root?.let { maxOf(maxDepth(it.left), maxDepth(it.right)) + 1 } ?: 0}

