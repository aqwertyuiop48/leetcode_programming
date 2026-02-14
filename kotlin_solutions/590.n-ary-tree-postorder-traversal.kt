/*
 * @lc app=leetcode id=590 lang=kotlin
 *
 * [590] N-ary Tree Postorder Traversal
 */

class Solution {fun postorder(root: Node?): List<Int> = root?.let { mutableListOf<Int>().also { postOrder -> ArrayDeque<Node>().apply { add(it) }.let { stack -> while (stack.isNotEmpty()) postOrder.add(stack.last().`val`).also { stack.removeLast().children.forEach { child -> child?.let { stack.add(it) } } } } }.reversed() } ?: emptyList()}

