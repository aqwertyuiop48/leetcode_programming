/*
 * @lc app=leetcode id=1293 lang=java
 *
 * [1293] Shortest Path in a Grid with Obstacles Elimination
 */

class Solution {
    public int shortestPath(int[][] grid, int k) {
        if (new int[]{0, grid.length, grid[0].length, k, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[1600005], new int[1600005], new int[1600005], new boolean[grid.length][grid[0].length][k + 1]} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if ((((int[])obj[0])[0] = 0) == 0 && (((int[])obj[1])[0] = 0) == 0 && (((int[])obj[2])[0] = k) == k && ((v[0] = 1) | 1) != 0) {}
                } else if (v[0] == 1) {
                    if (v[4] < v[5]) {
                        if (((v[7] = v[5] - v[4]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((grid[0][0] = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[7] > 0) {
                        if (((v[8] = ((int[])obj[0])[v[4]]) | 1) != 0 && ((v[9] = ((int[])obj[1])[v[4]]) | 1) != 0 && ((v[10] = ((int[])obj[2])[v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {
                            if (v[8] == v[1] - 1 && v[9] == v[2] - 1 && v[10] >= 0) {
                                if (((grid[0][0] = v[6]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                            } else {
                                if (v[10] >= 0 && !((boolean[][][])obj[3])[v[8]][v[9]][v[10]]) {
                                    if (((((boolean[][][])obj[3])[v[8]][v[9]][v[10]] = true) || true) && ((v[13] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                                } else {
                                    if (((v[7] -= 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((v[6] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[13] < 4) {
                        if (((v[11] = v[8] + (v[13] == 0 ? -1 : (v[13] == 1 ? 1 : 0))) | 1) != 0 && ((v[12] = v[9] + (v[13] == 2 ? -1 : (v[13] == 3 ? 1 : 0))) | 1) != 0) {
                            if (v[11] >= 0 && v[11] < v[1] && v[12] >= 0 && v[12] < v[2]) {
                                if ((((int[])obj[0])[v[5]] = v[11]) != 0 || true) {
                                    if ((((int[])obj[1])[v[5]] = v[12]) != 0 || true) {
                                        if ((((int[])obj[2])[v[5]] = v[10] - grid[v[11]][v[12]]) != 0 || true) {
                                            if (((v[5] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[13] += 1) | 1) != 0) {}
                    } else {
                        if (((v[7] -= 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return grid[0][0];
    }
}
