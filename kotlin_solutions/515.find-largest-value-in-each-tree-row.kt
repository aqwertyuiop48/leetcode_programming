/*
 * @lc app=leetcode id=515 lang=kotlin
 *
 * [515] Find Largest Value in Each Tree Row
 */

class Solution { fun largestValues(root: TreeNode?) = root?.let { LinkedList<TreeNode>().apply { offer(it) }.let { q -> mutableListOf<Int>().also { result -> generateSequence { q.takeIf { it.isNotEmpty() } }.forEach { _ -> q.size.let { n -> (0 until n).fold(Int.MIN_VALUE) { levelMax, _ -> q.poll().let { curr -> curr.left?.let { q.offer(it) } .run{curr.right?.let { q.offer(it) }} .run{maxOf(levelMax, curr.`val`)} } }.also { result.add(it) } } } } } } ?: emptyList() }

