/*
 * @lc app=leetcode id=1275 lang=kotlin
 *
 * [1275] Find Winner on a Tic Tac Toe Game
 */

class Solution {
    fun tictactoe(moves: Array<IntArray>): String = IntArray(8).let { a -> IntArray(8).let { b -> moves.indices.firstNotNullOfOrNull { i -> (if (i % 2 == 0) a else b).let { p -> moves[i][0].let { r -> moves[i][1].let { c -> p[r]++.also { p[c + 3]++ }.also { if (r == c) p[6]++ }.also { if (r + c == 2) p[7]++ }.run { if (p[r] == 3 || p[c + 3] == 3 || p[6] == 3 || p[7] == 3) if (i % 2 == 0) "A" else "B" else null } } } } } ?: if (moves.size == 9) "Draw" else "Pending" } }
}