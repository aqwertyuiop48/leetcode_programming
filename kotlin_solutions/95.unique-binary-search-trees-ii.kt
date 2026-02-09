/*
 * @lc app=leetcode id=95 lang=kotlin
 *
 * [95] Unique Binary Search Trees II
 */

class Solution {fun generateTrees(n: Int): List<TreeNode?> = (object { fun generate(min: Int, max: Int): List<TreeNode?> = if (min > max) listOf(null) else if (min == max) listOf(TreeNode(min)) else (min..max).flatMap { i -> generate(min, i - 1).flatMap { l -> generate(i + 1, max).map { r -> TreeNode(i).apply { left = l }.apply { right = r } } } } }).generate(1, n)}

