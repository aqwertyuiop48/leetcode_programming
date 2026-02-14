/*
 * @lc app=leetcode id=653 lang=kotlin
 *
 * [653] Two Sum IV - Input is a BST
 */

class Solution(private val values: MutableSet<Int> = mutableSetOf()) { fun findTarget(root: TreeNode?, k: Int): Boolean { return root?.let { values.contains(k - root.`val`) || run { values.add(root.`val`) .run{findTarget(root.left, k) || findTarget(root.right, k)} } } ?: false } }

