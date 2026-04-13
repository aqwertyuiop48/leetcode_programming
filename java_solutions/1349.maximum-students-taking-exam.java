/*
 * @lc app=leetcode id=1349 lang=java
 *
 * [1349] Maximum Students Taking Exam
 */

class Solution {
    public int maxStudents(char[][] seats) {
        if (new int[]{0, seats.length, seats[0].length, 0, 0, 0, 0, 1 << seats[0].length, 0, 0} instanceof int[] v && new int[seats.length + 1][1 << seats[0].length] instanceof int[][] dp) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[3] <= v[1]) {
                        if (v[4] < v[7]) {
                            if (((dp[v[3]][v[4]] = -1) | 1) != 0) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[3] += 1) | 1) != 0) {
                                if (((v[4] = 0) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((dp[0][0] = 0) | 1) != 0) {
                            if (((v[3] = 0) | 1) != 0) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[3] < v[1]) {
                        if (v[9] < v[2]) {
                            if (seats[v[3]][v[9]] == '.') {
                                if (((v[6] |= (1 << v[9])) | 1) != 0) {}
                            }
                            if (((v[9] += 1) | 1) != 0) {}
                        } else {
                            if (((v[4] = 0) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[4] = 0) | 1) != 0) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[4] < v[7]) {
                        if (dp[v[3]][v[4]] != -1) {
                            if (((v[5] = 0) | 1) != 0) {
                                if (((v[0] = 3) | 1) != 0) {}
                            }
                        } else {
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0) {
                            if (((v[9] = 0) | 1) != 0) {
                                if (((v[6] = 0) | 1) != 0) {
                                    if (((v[0] = 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                } else if (v[0] == 3) {
                    if (v[5] < v[7]) {
                        if ((v[5] & ~v[6]) == 0 && (v[5] & (v[5] >> 1)) == 0 && (v[5] & (v[4] >> 1)) == 0 && (v[5] & (v[4] << 1)) == 0) {
                            if (((dp[v[3] + 1][v[5]] = Math.max(dp[v[3] + 1][v[5]], dp[v[3]][v[4]] + Integer.bitCount(v[5]))) | 1) != 0) {}
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    } else {
                        if (((v[4] += 1) | 1) != 0) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 4) {
                    if (v[4] < v[7]) {
                        if (((v[8] = Math.max(v[8], dp[v[1]][v[4]])) | 1) != 0) {
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((seats[0][0] = (char) v[8]) | 1) != 0) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return seats[0][0];
    }
}
