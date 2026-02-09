/*
 * @lc app=leetcode id=79 lang=kotlin
 *
 * [79] Word Search
 */

class Solution { fun exist(board: Array<CharArray>, word: String): Boolean = board.indices.any { i -> board[i].indices.any { j -> DeepRecursiveFunction<Triple<Int, Int, Int>, Boolean> { (r, c, count) -> (count == word.length).let { if (it) true else (r !in board.indices || c !in board[r].indices || board[r][c] != word[count]).let { invalid -> if (invalid) false else board[r][c].let { original -> listOf(r - 1 to c, r + 1 to c, r to c - 1, r to c + 1) .also { board[r][c] = '@' } .any { (nr, nc) -> callRecursive(Triple(nr, nc, count + 1)) } .also { board[r][c] = original } } } } }.invoke(Triple(i, j, 0)) } } }

