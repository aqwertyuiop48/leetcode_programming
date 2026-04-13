/*
 * @lc app=leetcode id=782 lang=java
 *
 * [782] Transform to Chessboard
 */

class Solution {
    public int movesToChessboard(int[][] board) {
        if (new int[]{0, board.length, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v) {
            while (v[0] < 6) {
                if (v[0] == 0) {
                    if (v[1] > 0) {
                        if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[8] < v[1]) {
                        if (((v[7] = 0) | 1) != 0) {
                            while (v[7] < v[1]) {
                                if ((board[0][0] ^ board[v[8]][0] ^ board[0][v[7]] ^ board[v[8]][v[7]]) == 1) {
                                    if (((v[6] = -1) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                                }
                                if (((v[7] += 1) | 1) != 0) {}
                            }
                        }
                        if (v[0] != 6) {
                            if (((v[2] += board[0][v[8]]) | 1) != 0 && ((v[3] += board[v[8]][0]) | 1) != 0) {
                                if (board[v[8]][0] == v[8] % 2) { 
                                    if (((v[4] += 1) | 1) != 0) {} 
                                }
                                if (board[0][v[8]] == v[8] % 2) { 
                                    if (((v[5] += 1) | 1) != 0) {} 
                                }
                            }
                            if (((v[8] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (v[2] < v[1] / 2 || v[2] > (v[1] + 1) / 2 || v[3] < v[1] / 2 || v[3] > (v[1] + 1) / 2) {
                            if (((v[6] = -1) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                        } else {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[1] % 2 == 1) {
                        if (v[5] % 2 == 1) { 
                            if (((v[5] = v[1] - v[5]) | 1) != 0) {} 
                        }
                        if (v[4] % 2 == 1) { 
                            if (((v[4] = v[1] - v[4]) | 1) != 0) {} 
                        }
                    } else {
                        if (((v[5] = Math.min(v[1] - v[5], v[5])) | 1) != 0) {
                            if (((v[4] = Math.min(v[1] - v[4], v[4])) | 1) != 0) {}
                        }
                    }
                    if (((v[6] = (v[5] + v[4]) / 2) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                }
            }
            if (((board[0][0] = v[6]) | 1) != 0) {}
        }
        return board.length > 0 ? board[0][0] : -1;
    }
}
