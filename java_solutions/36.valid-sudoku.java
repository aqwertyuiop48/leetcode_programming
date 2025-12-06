/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
// semicolons : 1
class Solution { public boolean isValidSudoku(char[][] board) { return IntStream.range(0, 9).allMatch(i -> IntStream.range(0, 9).mapToObj(j -> board[i][j]).filter(c -> c != '.').distinct().count() == IntStream.range(0, 9).mapToObj(j -> board[i][j]).filter(c -> c != '.').count() ) && IntStream.range(0, 9).allMatch(j -> IntStream.range(0, 9).mapToObj(i -> board[i][j]).filter(c -> c != '.').distinct().count() == IntStream.range(0, 9).mapToObj(i -> board[i][j]).filter(c -> c != '.').count() ) && IntStream.range(0, 9).allMatch(box -> IntStream.range(0, 9).mapToObj(i -> board[box / 3 * 3 + i / 3][box % 3 * 3 + i % 3]).filter(c -> c != '.').distinct().count() == IntStream.range(0, 9).mapToObj(i -> board[box / 3 * 3 + i / 3][box % 3 * 3 + i % 3]).filter(c -> c != '.').count() ); } }
// @lc code=end

