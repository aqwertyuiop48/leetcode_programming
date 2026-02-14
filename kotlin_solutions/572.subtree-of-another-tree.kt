/*
 * @lc app=leetcode id=572 lang=kotlin
 *
 * [572] Subtree of Another Tree
 */

class Solution { fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean = root?.let { isSameTree(it, subRoot) || isSubtree(it.left, subRoot) || isSubtree(it.right, subRoot) } ?: false fun isSameTree(x: TreeNode?, y: TreeNode?): Boolean = if (x == null && y == null) true else if (x == null || y == null) false else if (x.`val` != y.`val`) false else isSameTree(x.left, y.left) && isSameTree(x.right, y.right) }
