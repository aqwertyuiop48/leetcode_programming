/*
 * @lc app=leetcode id=419 lang=kotlin
 *
 * [419] Battleships in a Board
 */

class Solution {fun countBattleships(board: Array<CharArray>): Int = board.indices.sumOf { i -> board[0].indices.count { j -> board[i][j] == 'X' && (i == 0 || board[i - 1][j] != 'X') && (j == 0 || board[i][j - 1] != 'X') } }}

