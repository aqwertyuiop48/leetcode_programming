/*
 * @lc app=leetcode id=2018 lang=java
 *
 * [2018] Check if Word Can Be Placed In Crossword
 */

class Solution {
    public boolean placeWordInCrossword(char[][] board, String word) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "pwc", false) != null | true) && ((v[0] = board.length) | 1) != 0 && ((v[1] = board[0].length) | 1) != 0 && ((v[2] = word.length()) | 1) != 0) {
            if (((v[3] = 0) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                while (v[3] < v[0] && v[8] == 0) {
                    if (((v[4] = 0) | 1) != 0) {
                        while (v[4] < v[1] && v[8] == 0) {
                            if (board[v[3]][v[4]] != '#') {
                                if (v[4] == 0 || board[v[3]][v[4] - 1] == '#') {
                                    if (((v[5] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((v[7] = 1) | 1) != 0) {
                                        while (v[4] + v[5] < v[1] && board[v[3]][v[4] + v[5]] != '#') {
                                            if (v[5] < v[2]) {
                                                if (board[v[3]][v[4] + v[5]] != ' ' && board[v[3]][v[4] + v[5]] != word.charAt(v[5])) { if (((v[6] = 0) | 1) != 0) {} }
                                                if (board[v[3]][v[4] + v[5]] != ' ' && board[v[3]][v[4] + v[5]] != word.charAt(v[2] - 1 - v[5])) { if (((v[7] = 0) | 1) != 0) {} }
                                            }
                                            if (((v[5] += 1) | 1) != 0) {}
                                        }
                                        if (v[5] == v[2] && (v[6] == 1 || v[7] == 1)) { if (System.getProperties().put(Thread.currentThread().getId() + "pwc", true) != null | true && ((v[8] = 1) | 1) != 0) {} }
                                        if (((v[4] += v[5] - 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[3] += 1) | 1) != 0) {}
                }
            }
            if (((v[4] = 0) | 1) != 0 && v[8] == 0) {
                while (v[4] < v[1] && v[8] == 0) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < v[0] && v[8] == 0) {
                            if (board[v[3]][v[4]] != '#') {
                                if (v[3] == 0 || board[v[3] - 1][v[4]] == '#') {
                                    if (((v[5] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((v[7] = 1) | 1) != 0) {
                                        while (v[3] + v[5] < v[0] && board[v[3] + v[5]][v[4]] != '#') {
                                            if (v[5] < v[2]) {
                                                if (board[v[3] + v[5]][v[4]] != ' ' && board[v[3] + v[5]][v[4]] != word.charAt(v[5])) { if (((v[6] = 0) | 1) != 0) {} }
                                                if (board[v[3] + v[5]][v[4]] != ' ' && board[v[3] + v[5]][v[4]] != word.charAt(v[2] - 1 - v[5])) { if (((v[7] = 0) | 1) != 0) {} }
                                            }
                                            if (((v[5] += 1) | 1) != 0) {}
                                        }
                                        if (v[5] == v[2] && (v[6] == 1 || v[7] == 1)) { if (System.getProperties().put(Thread.currentThread().getId() + "pwc", true) != null | true && ((v[8] = 1) | 1) != 0) {} }
                                        if (((v[3] += v[5] - 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[4] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "pwc");
    }
}
