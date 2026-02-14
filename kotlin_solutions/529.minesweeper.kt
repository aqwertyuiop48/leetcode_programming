/*
 * @lc app=leetcode id=529 lang=kotlin
 *
 * [529] Minesweeper
 */

class Solution { fun updateBoard(board: Array<CharArray>, click: IntArray) = click.let { (r, c) -> DeepRecursiveFunction<Pair<Int, Int>, Unit> { (i, j) -> if (i in board.indices && j in board[0].indices && board[i][j] == 'E') { listOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 1, 1 to -1, 1 to 0, 1 to 1).count { (di, dj) -> (i + di) in board.indices && (j + dj) in board[0].indices && board[i + di][j + dj] == 'M' }.let { mines -> if (mines == 0) { 'B'.also { board[i][j] = it }.also { listOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 1, 1 to -1, 1 to 0, 1 to 1).forEach { (di, dj) -> callRecursive(i + di to j + dj) } } } else board[i][j] = '0' + mines } } }(r to c).run { if (board[r][c] == 'M') board[r][c] = 'X' } .run{board} } }
