/*
 * @lc app=leetcode id=211 lang=kotlin
 *
 * [211] Design Add and Search Words Data Structure
 */

class WordDictionary(private val root: Node = Node()) { data class Node(val children: MutableMap<Char, Node> = mutableMapOf(), var isEnd: Boolean = false) fun addWord(word: String): Unit = word.fold(root) { node, c -> node.children.getOrPut(c) { Node() } }.apply { isEnd = true }.let { } fun search(word: String): Boolean = DeepRecursiveFunction<Pair<Node?, Int>, Boolean> { (node, i) -> when { node == null -> {false} i == word.length -> {node.isEnd} word[i] == '.' -> {node.children.values.any { callRecursive(it to i + 1) }} else -> callRecursive(node.children[word[i]] to i + 1) } }.invoke(root to 0) }

