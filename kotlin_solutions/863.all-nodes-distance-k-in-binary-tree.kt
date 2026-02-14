/*
 * @lc app=leetcode id=863 lang=kotlin
 *
 * [863] All Nodes Distance K in Binary Tree
 */

class Solution { fun distanceK(root: TreeNode?, target: TreeNode?, k: Int) = { graph: MutableMap<Int, MutableList<Int>> -> DeepRecursiveFunction<TreeNode?, Unit> { node -> node?.also { n -> n.left?.also { leftNode -> graph.getOrPut(n.`val`) { mutableListOf() }.add(leftNode.`val`).run { graph.getOrPut(leftNode.`val`) { mutableListOf() }.add(n.`val`) }.run { callRecursive(leftNode) } } .run{n.right?.also { rightNode -> graph.getOrPut(n.`val`) { mutableListOf() }.add(rightNode.`val`).run { graph.getOrPut(rightNode.`val`) { mutableListOf() }.add(n.`val`) }.run { callRecursive(rightNode) } }} } }(root).run { generateSequence(listOf(target!!.`val`) to setOf(target.`val`)) { (curr, vis) -> curr.flatMap { graph[it].orEmpty() }.filter { it !in vis }.takeIf { it.isNotEmpty() }?.run { this to (vis + this) } }.drop(k).firstOrNull()?.first.orEmpty() } }(mutableMapOf()) }

