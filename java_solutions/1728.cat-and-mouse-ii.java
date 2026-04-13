/*
 * @lc app=leetcode id=1728 lang=java
 *
 * [1728] Cat and Mouse II
 */

class Solution {
    public boolean canMouseWin(String[] grid, int catJump, int mouseJump) {
        if (new int[]{0, grid.length, grid[0].length(), grid.length * grid[0].length(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new char[v[3]] instanceof char[] gr && new int[128] instanceof int[] children && new int[128][64] instanceof int[][] parents && new int[128] instanceof int[] pCount && new int[8192] instanceof int[] color && new int[100000] instanceof int[] q && new int[]{1, 0, -1, 0} instanceof int[] dx && new int[]{0, -1, 0, 1} instanceof int[] dy) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[7] < v[1]) {
                        if (((v[8] = 0) | 1) != 0) {
                            while (v[8] < v[2]) {
                                if (((gr[v[7] * v[2] + v[8]] = grid[v[7]].charAt(v[8])) | 1) != 0) {
                                    if (gr[v[7] * v[2] + v[8]] == 'M') {
                                        if (((v[4] = v[7] * v[2] + v[8]) | 1) != 0) {}
                                    } else if (gr[v[7] * v[2] + v[8]] == 'C') {
                                        if (((v[5] = v[7] * v[2] + v[8]) | 1) != 0) {}
                                    } else if (gr[v[7] * v[2] + v[8]] == 'F') {
                                        if (((v[6] = v[7] * v[2] + v[8]) | 1) != 0) {}
                                    }
                                }
                                if (((v[8] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[7] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[7] < v[1]) {
                        if (((v[8] = 0) | 1) != 0) {
                            while (v[8] < v[2]) {
                                if (gr[v[7] * v[2] + v[8]] != '#') {
                                    if (((v[9] = 0) | 1) != 0) {
                                        while (v[9] < 2) {
                                            if (((v[10] = 0) | 1) != 0) {
                                                while (v[10] < 4) {
                                                    if (((v[11] = 1) | 1) != 0) {
                                                        while (v[11] <= (v[9] == 0 ? mouseJump : catJump)) {
                                                            if (((v[12] = v[7] + dx[v[10]] * v[11]) | 1) != 0 && ((v[13] = v[8] + dy[v[10]] * v[11]) | 1) != 0) {
                                                                if (v[12] > -1 && v[12] < v[1] && v[13] > -1 && v[13] < v[2] && gr[v[12] * v[2] + v[13]] != '#') {
                                                                    if (((children[v[12] * v[2] + v[13] + v[9] * 64] += 1) | 1) != 0) {
                                                                        if (((parents[v[7] * v[2] + v[8] + v[9] * 64][pCount[v[7] * v[2] + v[8] + v[9] * 64]++] = v[12] * v[2] + v[13]) | 1) != 0) {}
                                                                    }
                                                                } else {
                                                                    if (((v[11] = 1000) | 1) != 0) {}
                                                                }
                                                            }
                                                            if (((v[11] += 1) | 1) != 0) {}
                                                        }
                                                    }
                                                    if (((v[10] += 1) | 1) != 0) {}
                                                }
                                            }
                                            if (((children[v[7] * v[2] + v[8] + v[9] * 64] += 1) | 1) != 0) {
                                                if (((parents[v[7] * v[2] + v[8] + v[9] * 64][pCount[v[7] * v[2] + v[8] + v[9] * 64]++] = v[7] * v[2] + v[8]) | 1) != 0) {}
                                            }
                                            if (((v[9] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[8] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0 && ((v[7] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[7] < v[1]) {
                        if (((v[8] = 0) | 1) != 0) {
                            while (v[8] < v[2]) {
                                if (gr[v[7] * v[2] + v[8]] != '#' && gr[v[7] * v[2] + v[8]] != 'F') {
                                    if (((color[v[6] * 64 + (v[7] * v[2] + v[8]) + 4096] = -1) | 1) != 0) {
                                        if (((q[v[15]++] = v[6] * 64 + (v[7] * v[2] + v[8]) + 4096) | 1) != 0) {}
                                    }
                                }
                                if (((v[8] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[14] < v[15]) {
                        if (((v[16] = q[v[14]++]) | 1) != 0 && ((v[9] = v[16] / 4096) | 1) != 0 && ((v[17] = (v[16] % 4096) / 64) | 1) != 0 && ((v[18] = v[16] % 64) | 1) != 0) {
                            if (((v[10] = 1 - v[9]) | 1) != 0 && ((v[11] = v[10] == 0 ? v[17] : v[18] + 64) | 1) != 0 && ((v[12] = 0) | 1) != 0) {
                                while (v[12] < pCount[v[11]]) {
                                    if (((v[13] = parents[v[11]][v[12]]) | 1) != 0) {
                                        if (v[10] == 0) {
                                            if (((v[19] = v[13] * 64 + v[18]) | 1) != 0) {
                                                if (color[v[19]] != -1 && v[13] != v[18] && v[18] != v[6]) {
                                                    if (((color[v[19]] = -1) | 1) != 0 && ((q[v[15]++] = v[19]) | 1) != 0) {}
                                                }
                                            }
                                        } else {
                                            if (((v[19] = v[17] * 64 + v[13] + 4096) | 1) != 0) {
                                                if (color[v[19]] != -1 && v[17] != v[13] && v[13] != v[6]) {
                                                    if (((color[v[19]] += 1) | 1) != 0) {
                                                        if (color[v[19]] == children[v[13] + 64]) {
                                                            if (((color[v[19]] = -1) | 1) != 0 && ((q[v[15]++] = v[19]) | 1) != 0) {}
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (((v[12] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((grid[0] = color[v[4] * 64 + v[5]] == -1 ? "W" : "L") != null) && ((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
        }
        return grid[0] == "W";
    }
}
