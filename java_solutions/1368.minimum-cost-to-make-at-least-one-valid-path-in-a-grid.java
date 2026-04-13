/*
 * @lc app=leetcode id=1368 lang=java
 *
 * [1368] Minimum Cost to Make at Least One Valid Path in a Grid
 */

class Solution {
    public int minCost(int[][] grid) {
        if (new int[]{0, grid.length, grid[0].length, 20000, 20000, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[grid.length][grid[0].length], new int[40005], new int[]{0, 0, 1, -1}, new int[]{1, -1, 0, 0}} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[5] < v[1]) {
                        if (v[6] < v[2]) {
                            if ((((int[][])obj[0])[v[5]][v[6]] = 1000000) != 0 || true) {
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[5] += 1) | 1) != 0) {
                                if (((v[6] = 0) | 1) != 0) {}
                            }
                        }
                    } else {
                        if ((((int[][])obj[0])[0][0] = 0) == 0) {
                            if ((((int[])obj[1])[v[4]++] = 0) == 0) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[3] < v[4]) {
                        if (((v[11] = ((int[])obj[1])[v[3]++]) | 1) != 0) {
                            if (((v[5] = v[11] / 1000) | 1) != 0) {
                                if (((v[6] = v[11] % 1000) | 1) != 0) {
                                    if (((v[7] = 0) | 1) != 0) {
                                        if (((v[0] = 2) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    } else {
                        if (((grid[0][0] = ((int[][])obj[0])[v[1] - 1][v[2] - 1]) | 1) != 0) {
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[7] < 4) {
                        if (((v[8] = v[5] + ((int[])obj[2])[v[7]]) | 1) != 0) {
                            if (((v[9] = v[6] + ((int[])obj[3])[v[7]]) | 1) != 0) {
                                if (((v[10] = (grid[v[5]][v[6]] != (v[7] + 1)) ? 1 : 0) | 1) != 0) {
                                    if (v[8] >= 0 && v[8] < v[1] && v[9] >= 0 && v[9] < v[2] && ((int[][])obj[0])[v[5]][v[6]] + v[10] < ((int[][])obj[0])[v[8]][v[9]]) {
                                        if ((((int[][])obj[0])[v[8]][v[9]] = ((int[][])obj[0])[v[5]][v[6]] + v[10]) != -1) {
                                            if (v[10] == 1) {
                                                if ((((int[])obj[1])[v[4]++] = v[8] * 1000 + v[9]) != -1) {}
                                            } else {
                                                if ((((int[])obj[1])[--v[3]] = v[8] * 1000 + v[9]) != -1) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return grid[0][0];
    }
}
