/*
 * @lc app=leetcode id=37 lang=kotlin
 *
 * [37] Sudoku Solver
 */

class Solution { fun solveSudoku(board: Array<CharArray>) = DeepRecursiveFunction<Int, Boolean> { d -> if (d == 81) true else (d / 9 to d % 9).let { (r, c) -> if (board[r][c] != '.') callRecursive(d + 1) else BooleanArray(255) { true }.apply { (0 until 9).forEach { k -> listOf(board[r][k], board[k][c], board[r / 3 * 3 + k / 3][c / 3 * 3 + k % 3]) .filter { it != '.' } .forEach { this[it.code] = false } } }.let { flags -> ('1'..'9').any { ch -> flags[ch.code] && board.apply { this[r][c] = ch } .let { callRecursive(d + 1) } .also { if (!it) board[r][c] = '.' } } } } }.invoke(0).let { } }

