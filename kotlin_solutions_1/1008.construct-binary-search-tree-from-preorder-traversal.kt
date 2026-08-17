/*
 * @lc app=leetcode id=1008 lang=kotlin
 *
 * [1008] Construct Binary Search Tree from Preorder Traversal
 */

class Solution {
    fun bstFromPreorder(preorder: IntArray): TreeNode? = IntArray(1).let { i -> DeepRecursiveFunction<Int, TreeNode?> { bound -> if (i[0] == preorder.size || preorder[i[0]] > bound) null else TreeNode(preorder[i[0]].also { i[0]++ }).also { it.left = callRecursive(it.`val`) }.also { it.right = callRecursive(bound) } }.invoke(Int.MAX_VALUE) }
}