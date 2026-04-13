/*
 * @lc app=leetcode id=980 lang=java
 *
 * [980] Unique Paths III
 */

class Solution {
    public int uniquePathsIII(int[][] grid) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[400], new int[400], new int[400], new int[400], new int[]{1, -1, 0, 0}, new int[]{0, 0, 1, -1}} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[1] < grid.length) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < grid[0].length) {
                                if (grid[v[1]][v[2]] == 0) {
                                    if (((v[3] += 1) | 1) != 0) {}
                                } else if (grid[v[1]][v[2]] == 1) {
                                    if (((v[4] = v[1]) | 1) != 0 && ((v[5] = v[2]) | 1) != 0) {}
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((((int[])obj[0])[0] = v[4]) | 1) != 0 && ((((int[])obj[1])[0] = v[5]) | 1) != 0 && ((((int[])obj[2])[0] = v[3]) | 1) != 0 && ((((int[])obj[3])[0] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[6] >= 0) {
                        if (((v[1] = ((int[])obj[0])[v[6]]) | 1) != 0 && ((v[2] = ((int[])obj[1])[v[6]]) | 1) != 0 && ((v[3] = ((int[])obj[2])[v[6]]) | 1) != 0 && ((v[4] = ((int[])obj[3])[v[6]]) | 1) != 0) {
                            if (v[4] == 0) {
                                if (grid[v[1]][v[2]] == 2) {
                                    if (v[3] == -1) {
                                        if (((v[7] += 1) | 1) != 0) {}
                                    }
                                    if (((v[6] -= 1) | 1) != 0) {}
                                } else {
                                    if (((grid[v[1]][v[2]] = -1) | 1) != 0 && (((((int[])obj[3])[v[6]] += 1) | 1) != 0)) {}
                                }
                            } else if (v[4] >= 1 && v[4] <= 4) {
                                if (((((int[])obj[3])[v[6]] += 1) | 1) != 0) {
                                    if (((v[5] = v[1] + ((int[])obj[4])[v[4] - 1]) | 1) != 0 && ((v[8] = v[2] + ((int[])obj[5])[v[4] - 1]) | 1) != 0) {
                                        if (v[5] >= 0 && v[5] < grid.length && v[8] >= 0 && v[8] < grid[0].length && grid[v[5]][v[8]] != -1) {
                                            if (((v[6] += 1) | 1) != 0 && ((((int[])obj[0])[v[6]] = v[5]) | 1) != 0 && ((((int[])obj[1])[v[6]] = v[8]) | 1) != 0 && ((((int[])obj[2])[v[6]] = v[3] - 1) | 1) != 0 && ((((int[])obj[3])[v[6]] = 0) | 1) != 0) {}
                                        }
                                    }
                                }
                            } else {
                                if (((grid[v[1]][v[2]] = 0) | 1) != 0 && ((v[6] -= 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((grid[0][0] = v[7]) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                }
            }
        }
        return grid[0][0];
    }
}
