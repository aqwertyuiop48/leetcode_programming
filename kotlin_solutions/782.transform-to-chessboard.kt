/*
 * @lc app=leetcode id=782 lang=kotlin
 *
 * [782] Transform to Chessboard
 */

class Solution { fun movesToChessboard(board: Array<IntArray>): Int = board.size.let { n -> (0 until n).flatMap { i -> (0 until n).map { j -> i to j } } .any { (i, j) -> (board[0][0] xor board[i][0] xor board[0][j] xor board[i][j]) == 1 } .let { invalid -> if (invalid) -1 else (0 until n).fold(intArrayOf(0, 0, 0, 0)) { acc, i -> intArrayOf(acc[0] + board[0][i], acc[1] + board[i][0], acc[2] + if (board[i][0] == i % 2) 1 else 0, acc[3] + if (board[0][i] == i % 2) 1 else 0) }.let { (rowSum, colSum, rowSwap, colSwap) -> if (rowSum != n / 2 && rowSum != (n + 1) / 2 || colSum != n / 2 && colSum != (n + 1) / 2) -1 else ((if (n % 2 == 1) intArrayOf(if (rowSwap % 2 == 1) n - rowSwap else rowSwap, if (colSwap % 2 == 1) n - colSwap else colSwap) else intArrayOf(minOf(n - rowSwap, rowSwap), minOf(n - colSwap, colSwap))).sum() / 2) } } } }
