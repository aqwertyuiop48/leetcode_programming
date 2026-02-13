/*
 * @lc app=leetcode id=110 lang=kotlin
 *
 * [110] Balanced Binary Tree
 */

class Solution { fun isBalanced(root: TreeNode?): Boolean = DeepRecursiveFunction<TreeNode?, Int> { node -> node?.let { callRecursive(it.left).let { leftHeight -> callRecursive(it.right).let { rightHeight -> if (leftHeight == -1 || rightHeight == -1 || kotlin.math.abs(leftHeight - rightHeight) > 1) -1 else maxOf(leftHeight, rightHeight) + 1 } } } ?: 0 }.invoke(root) != -1 }

