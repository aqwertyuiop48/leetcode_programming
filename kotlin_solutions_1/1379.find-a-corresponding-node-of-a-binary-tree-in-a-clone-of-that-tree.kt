/*
 * @lc app=leetcode id=1379 lang=kotlin
 *
 * [1379] Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */

class Solution { fun getTargetCopy(original: TreeNode?, cloned: TreeNode?, target: TreeNode?): TreeNode? = if (original == null) null else if (original === target) cloned else getTargetCopy(original.left, cloned?.left, target) ?: getTargetCopy(original.right, cloned?.right, target) }