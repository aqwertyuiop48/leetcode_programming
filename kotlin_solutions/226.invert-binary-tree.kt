/*
 * @lc app=leetcode id=226 lang=kotlin
 *
 * [226] Invert Binary Tree
 */

class Solution {fun invertTree(root: TreeNode?): TreeNode? =root?.apply { left = invertTree(right).also { right = invertTree(left) } }}

