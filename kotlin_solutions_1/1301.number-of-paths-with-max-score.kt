/*
 * @lc app=leetcode id=1301 lang=kotlin
 *
 * [1301] Number of Paths with Max Score
 */

class Solution { fun pathsWithMaxScore(board: List<String>): IntArray = board.size.let { n -> board[0].length.let { m -> Array(n) { IntArray(m) { -1 } }.apply { this[n - 1][m - 1] = 0 }.let { dp -> Array(n) { IntArray(m) }.apply { this[n - 1][m - 1] = 1 }.let { ways -> (n - 1 downTo 0).flatMap { r -> (m - 1 downTo 0).map { c -> r to c } }.forEach { (r, c) -> (board[r][c] != 'X' && (r != n - 1 || c != m - 1)).takeIf { it }?.let { listOf(r + 1 to c, r to c + 1, r + 1 to c + 1).filter { (nr, nc) -> nr in 0 until n && nc in 0 until m && dp[nr][nc] != -1 }.takeIf { it.isNotEmpty() }?.let { valid -> valid.maxOf { (nr, nc) -> dp[nr][nc] }.let { maxS -> dp[r][c] = (maxS + if (board[r][c] == 'E') 0 else board[r][c] - '0').also { ways[r][c] = valid.filter { (nr, nc) -> dp[nr][nc] == maxS }.fold(0) { acc, (nr, nc) -> (acc + ways[nr][nc]) % 1000000007 } } } } } }.let { intArrayOf(if (dp[0][0] == -1) 0 else dp[0][0], if (dp[0][0] == -1) 0 else ways[0][0]) } } } } } }