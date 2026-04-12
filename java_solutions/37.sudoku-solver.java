/*
 * @lc app=leetcode id=37 lang=java
 *
 * [37] Sudoku Solver
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        if (new int[]{0, 0, 0, 0} instanceof int[] v && new int[81][2] instanceof int[][] empty && new char[81] instanceof char[] state) {
            while (v[0] < 9) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < 9) {
                        if (board[v[0]][v[1]] == '.') {
                            if (((empty[v[2]][0] = v[0]) | 1) != 0 && ((empty[v[2]][1] = v[1]) | 1) != 0 && ((state[v[2]] = '1') | 1) != 0) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[3] = 0) | 1) != 0) {
                while (v[3] >= 0 && v[3] < v[2]) {
                    if (((v[0] = empty[v[3]][0]) | 1) != 0 && ((v[1] = empty[v[3]][1]) | 1) != 0 && ((board[v[0]][v[1]] = '.') | 1) != 0) {
                        while (state[v[3]] <= '9' && board[v[0]][v[1]] == '.') {
                            if (new int[]{0, 1} instanceof int[] chk) {
                                while (chk[0] < 9) {
                                    if (board[chk[0]][v[1]] == state[v[3]] || board[v[0]][chk[0]] == state[v[3]] || board[3 * (v[0] / 3) + chk[0] / 3][3 * (v[1] / 3) + chk[0] % 3] == state[v[3]]) {
                                        if (((chk[1] = 0) | 1) != 0) {}
                                    }
                                    if (((chk[0] += 1) | 1) != 0) {}
                                }
                                if (chk[1] == 1) {
                                    if (((board[v[0]][v[1]] = state[v[3]]) | 1) != 0) {}
                                }
                            }
                            if (((state[v[3]] += 1) | 1) != 0) {}
                        }
                        if (board[v[0]][v[1]] == '.') {
                            if (((state[v[3]] = '1') | 1) != 0 && ((v[3] -= 1) | 1) != 0) {}
                        } else {
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return;
    }
}
// @lc code=end

