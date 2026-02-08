/*
 * @lc app=leetcode id=51 lang=kotlin
 *
 * [51] N-Queens
 */
class Solution { fun solveNQueens(n: Int): List<List<String>> = (object : Function3<Array<CharArray>, Int, Int, List<List<String>>> { override operator fun invoke(board: Array<CharArray>, row: Int, currentN: Int): List<List<String>> = if (row == currentN) listOf(board.map { it.joinToString("") }) else (0 until currentN).filter { col -> (0 until row).none { i -> board[i][col] == 'Q' || (col - row + i >= 0 && board[i][col - row + i] == 'Q') || (col + row - i < currentN && board[i][col + row - i] == 'Q') } }.flatMap { col -> board.map { it.copyOf() }.toTypedArray().apply { this[row][col] = 'Q' }.let { newBoard -> this(newBoard, row + 1, currentN) } } })(Array(n) { CharArray(n) { '.' } }, 0, n) }
