/*
 * @lc app=leetcode id=488 lang=kotlin
 *
 * [488] Zuma Game
 */

class Solution { fun findMinStep(board: String, hand: String): Int = mutableMapOf<String, Int>().let { memo -> DeepRecursiveFunction<Pair<String, String>, Int> { (b, h) -> memo.getOrPut("$b#$h") { generateSequence(b) { str -> str.replace(Regex("(.)\\1{2,}"), "").takeIf { it != str } }.last().let { board -> when { board.isEmpty() -> {0} h.isEmpty() -> {100} else -> h.indices.minOfOrNull { i -> board.indices.filter { j -> board[j] == h[i] || (j < board.length - 1 && board[j] == board[j + 1]) }.minOfOrNull { j -> 1 + callRecursive(board.substring(0, j + 1) + h[i] + board.substring(j + 1) to h.removeRange(i..i)) } ?: 100 } ?: 100 } } } }.invoke(board to hand).takeIf { it < 100 } ?: -1 } }