/*
 * @lc app=leetcode id=654 lang=kotlin
 *
 * [654] Maximum Binary Tree
 */

class Solution { fun constructMaximumBinaryTree(nums: IntArray): TreeNode? = nums.fold(ArrayDeque<TreeNode>()) { stack, num -> stack.apply { when { isEmpty() || num < last().`val` -> addLast(TreeNode(num)) else -> generateSequence(removeLast()) { curr -> if (isNotEmpty() && num > last().`val`) last().apply { right = curr }.let { removeLast() } else null }.last().let { curr -> addLast(TreeNode(num).apply { left = curr }) } } } }.let { stack -> generateSequence(if (stack.isNotEmpty()) stack.removeLast() else null) { curr -> if (stack.isNotEmpty()) stack.removeLast().apply { right = curr } else null }.lastOrNull() } }
