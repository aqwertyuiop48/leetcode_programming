/*
 * @lc app=leetcode id=138 lang=kotlin
 *
 * [138] Copy List with Random Pointer
 */

class Solution { fun copyRandomList(node: Node?): Node? = node?.let { mutableMapOf<Node, Node>().apply { generateSequence(it) { it.next }.forEach { original -> getOrPut(original) { Node(original.`val`) } } }.also { map -> generateSequence(it) { it.next }.forEach { original -> map[original]!!.apply { next = original.next?.let { map[it] }.also { random = original.random?.let { map[it] } } } } }.let { map -> map[it] } } }

