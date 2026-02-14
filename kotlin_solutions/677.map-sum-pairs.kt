/*
 * @lc app=leetcode id=677 lang=kotlin
 *
 * [677] Map Sum Pairs
 */

class Node(var sum: Int = 0, var value: Int = 0, var parent: Node? = null, val children: Array<Node?> = Array(26) { null }) class MapSum(val root: Node = Node()) { fun insert(key: String, `val`: Int) = key.fold(root) { node, c -> node.children[c - 'a'] ?: Node().also { it.parent = node }.also { node.children[c - 'a'] = it } }.let { node -> `val` - node.value }.let { diff -> generateSequence(key.fold(root) { node, c -> node.children[c - 'a']!! }.apply { value = `val` }) { it.parent }.forEach { it.sum += diff } } fun sum(prefix: String): Int = prefix.fold(root as Node?) { node, c -> node?.children?.get(c - 'a') }?.sum ?: 0 }
