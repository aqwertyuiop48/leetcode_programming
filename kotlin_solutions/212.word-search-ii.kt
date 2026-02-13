/*
 * @lc app=leetcode id=212 lang=kotlin
 *
 * [212] Word Search II
 */

class Solution { fun findWords(board: Array<CharArray>, words: Array<String>): List<String> = words.fold(mutableMapOf<Char, Any>()) { trie, word -> word.fold(trie as MutableMap<Char, Any>) { node, c -> node.getOrPut(c) { mutableMapOf<Char, Any>() } as MutableMap<Char, Any> }.apply { put('$', word) }.let{trie} }.let { trie -> mutableSetOf<String>().also { result -> board.indices.forEach { i -> board[i].indices.forEach { j -> DeepRecursiveFunction<Triple<Int, Int, MutableMap<Char, Any>>, Unit> { (r, c, node) -> if (r in board.indices && c in board[r].indices && board[r][c] in node) { board[r][c].also { ch -> (node[ch] as? MutableMap<Char, Any>)?.let { nextNode -> (nextNode['$'] as? String)?.let { result.add(it) } .also{board[r][c] = '#'} .also{listOf(r - 1 to c, r + 1 to c, r to c - 1, r to c + 1).forEach { (nr, nc) -> callRecursive(Triple(nr, nc, nextNode)) }} .also{board[r][c] = ch} } } } }.invoke(Triple(i, j, trie)) } } }.toList() } }

