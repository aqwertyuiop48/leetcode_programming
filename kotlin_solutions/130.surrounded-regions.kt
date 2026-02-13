/*
 * @lc app=leetcode id=130 lang=kotlin
 *
 * [130] Surrounded Regions
 */

class Solution { fun solve(board: Array<CharArray>): Unit = board.indices.forEach { i -> board[i].indices.forEach { j -> if ((i == 0 || i == board.lastIndex || j == 0 || j == board[i].lastIndex) && board[i][j] == 'O') { DeepRecursiveFunction<Pair<Int, Int>, Unit> { (r, c) -> if (r in board.indices && c in board[r].indices && board[r][c] == 'O') { '#'.also { board[r][c] = it }.run { listOf(r - 1 to c, r + 1 to c, r to c - 1, r to c + 1).forEach { callRecursive(it) } } } }.invoke(i to j) } } }.also { board.forEach { row -> row.indices.forEach { j -> row[j] = if (row[j] == '#') 'O' else if (row[j] == 'O') 'X' else row[j] } } } }
