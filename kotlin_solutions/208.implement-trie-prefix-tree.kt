/*
 * @lc app=leetcode id=208 lang=kotlin
 *
 * [208] Implement Trie (Prefix Tree)
 */

class Trie(private val root: Trie.Node = Trie.Node()) { data class Node(val children: MutableMap<Char, Node> = mutableMapOf(), var isEnd: Boolean = false) fun insert(word: String): Unit = word.fold(root) { node, c -> node.children.getOrPut(c) { Node() } }.apply { isEnd = true }.let { } fun search(word: String): Boolean = word.fold(root as Node?) { node, c -> node?.children?.get(c) }?.isEnd ?: false fun startsWith(prefix: String): Boolean = prefix.fold(root as Node?) { node, c -> node?.children?.get(c) } != null }