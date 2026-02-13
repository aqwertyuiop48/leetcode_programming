/*
 * @lc app=leetcode id=289 lang=kotlin
 *
 * [289] Game of Life
 */

class Solution {fun gameOfLife(board: Array<IntArray>) = board.indices.flatMap { i -> board[0].indices.map { j -> i to j } }.forEach { (i, j) -> listOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 1, 1 to -1, 1 to 0, 1 to 1).count { (di, dj) -> (i + di) in board.indices && (j + dj) in board[0].indices && board[i + di][j + dj] and 1 == 1 }.let { live -> board[i][j] = board[i][j] or (if ((board[i][j] == 1 && live in 2..3) || (board[i][j] == 0 && live == 3)) 2 else 0) } }.also { board.indices.forEach { i -> board[0].indices.forEach { j -> board[i][j] = board[i][j] shr 1 } } }}
