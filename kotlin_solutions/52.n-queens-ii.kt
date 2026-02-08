/*
 * @lc app=leetcode id=52 lang=kotlin
 *
 * [52] N-Queens II
 */


class Solution { fun totalNQueens(n: Int): Int = (object : Function4<IntArray, Int, Int, () -> Unit, Unit> { override operator fun invoke(board: IntArray, row: Int, currentN: Int, onSolution: () -> Unit) { if (row == currentN) onSolution() else (0 until currentN).forEach { col -> if ((0 until row).none { i -> board[i] == col || (board[i] - col).absoluteValue == (i - row).absoluteValue }) { board.copyOf().apply { this[row] = col }.let { newBoard -> this(newBoard, row + 1, currentN, onSolution) } } } } }).run { arrayOf(0).also { countRef -> IntArray(n) { -1 }.also { initialBoard -> this(initialBoard, 0, n) { countRef[0]++ } } }.let { it[0] } } }