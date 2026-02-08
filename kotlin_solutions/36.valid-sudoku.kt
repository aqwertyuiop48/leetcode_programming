/*
 * @lc app=leetcode id=36 lang=kotlin
 *
 * [36] Valid Sudoku
 */

class Solution {fun isValidSudoku(board: Array<CharArray>): Boolean = (0..8).all { i -> board[i].filter { it != '.' }.size == board[i].filter { it != '.' }.toSet().size } && (0..8).all { i -> (0..8).map { j -> board[j][i] }.filter { it != '.' }.size == (0..8).map { j -> board[j][i] }.filter { it != '.' }.toSet().size } && (0..2).all { bi -> (0..2).all { bj -> (0..2).flatMap { i -> (0..2).map { j -> board[bi * 3 + i][bj * 3 + j] } }.filter { it != '.' }.size == (0..2).flatMap { i -> (0..2).map { j -> board[bi * 3 + i][bj * 3 + j] } }.filter { it != '.' }.toSet().size } } }

