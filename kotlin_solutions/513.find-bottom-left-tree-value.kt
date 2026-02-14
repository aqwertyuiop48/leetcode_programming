/*
 * @lc app=leetcode id=513 lang=kotlin
 *
 * [513] Find Bottom Left Tree Value
 */

class Solution {fun findBottomLeftValue(root: TreeNode?) = LinkedList<TreeNode>().apply { root?.let { add(it) } }.let { q -> generateSequence { q.poll()?.also { node -> node.right?.let { q.add(it) }?.run { node.left?.let { q.add(it) } } ?: node.left?.let { q.add(it) } } }.last().`val` }}

