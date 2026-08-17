/*
 * @lc app=leetcode id=1305 lang=kotlin
 *
 * [1305] All Elements in Two Binary Search Trees
 */
class Solution { fun getAllElements(root1: TreeNode?, root2: TreeNode?): List<Int> = DeepRecursiveFunction<TreeNode?, List<Int>> { node -> node?.let { callRecursive(it.left) + it.`val` + callRecursive(it.right) } ?: emptyList() }.let { (it(root1) + it(root2)).sorted() } }