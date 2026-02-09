/*
 * @lc app=leetcode id=99 lang=kotlin
 *
 * [99] Recover Binary Search Tree
 */

class Solution {fun recoverTree(root: TreeNode?): Unit = arrayOf<TreeNode?>(null, null, null).let { nodes -> object { lateinit var traverse: (TreeNode?) -> Unit }.apply { traverse = { node -> node?.run { traverse(left).also { nodes[2]?.takeIf { it.`val` > `val` }?.apply { nodes[0] = nodes[0] ?: this }?.also { nodes[1] = this@run } }.also { nodes[2] = this }.also { traverse(right) } } ?: Unit } }.run { traverse(root).let { nodes[0]?.apply { `val` = nodes[1]!!.`val`.also { nodes[1]!!.`val` = `val` } } } } }}

