/*
 * @lc app=leetcode id=429 lang=kotlin
 *
 * [429] N-ary Tree Level Order Traversal
 */

class Solution{fun levelOrder(root: Node?): List<List<Int>> = root?.let { generateSequence(listOf(listOf(it))) { level -> level.last().flatMap { it.children?.filterNotNull() ?: emptyList() }.takeIf { it.isNotEmpty() }?.let { level + listOf(it) } }.last().map { nodes -> nodes.map { it.`val` } } } ?: emptyList() }

