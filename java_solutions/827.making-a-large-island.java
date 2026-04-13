/*
 * @lc app=leetcode id=827 lang=java
 *
 * [827] Making A Large Island
 */

class Solution {
    public int largestIsland(int[][] grid) {
        if (System.getProperties().put("ans", 0) != null || true) {
            if (new int[]{0, grid.length, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[grid.length * grid.length][2], new int[grid.length * grid.length + 2], new int[]{0, 0, 1, -1}, new int[]{1, -1, 0, 0}, new int[4]} instanceof Object[] obj) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (v[4] < v[1]) {
                            if (((v[5] = 0) | 1) != 0) {
                                while (v[5] < v[1]) {
                                    if (grid[v[4]][v[5]] == 1) {
                                        if (((v[6] = 0) | 1) != 0 && ((v[7] = 1) | 1) != 0 && ((((int[][])obj[0])[0][0] = v[4]) != -1) && ((((int[][])obj[0])[0][1] = v[5]) != -1) && ((grid[v[4]][v[5]] = v[3]) != -1)) {
                                            while (v[6] < v[7]) {
                                                if (((v[8] = ((int[][])obj[0])[v[6]][0]) | 1) != 0 && ((v[9] = ((int[][])obj[0])[v[6]++][1]) | 1) != 0 && ((v[10] = 0) | 1) != 0) {
                                                    while (v[10] < 4) {
                                                        if (((v[11] = v[8] + ((int[])obj[2])[v[10]]) | 1) != 0 && ((v[12] = v[9] + ((int[])obj[3])[v[10]]) | 1) != 0) {
                                                            if (v[11] >= 0 && v[11] < v[1] && v[12] >= 0 && v[12] < v[1] && grid[v[11]][v[12]] == 1) {
                                                                if (((grid[v[11]][v[12]] = v[3]) != -1) && ((((int[][])obj[0])[v[7]][0] = v[11]) != -1) && ((((int[][])obj[0])[v[7]++][1] = v[12]) != -1)) {}
                                                            }
                                                        }
                                                        if (((v[10] += 1) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                            if ((((int[])obj[1])[v[3]++] = v[7]) != -1 && ((v[14] = Math.max(v[14], v[7])) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        } else {
                            if (((v[4] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[4] < v[1]) {
                            if (((v[5] = 0) | 1) != 0) {
                                while (v[5] < v[1]) {
                                    if (grid[v[4]][v[5]] == 0) {
                                        if (((v[10] = 0) | 1) != 0 && ((v[13] = 1) | 1) != 0) {
                                            while (v[10] < 4) {
                                                if (((v[11] = v[4] + ((int[])obj[2])[v[10]]) | 1) != 0 && ((v[12] = v[5] + ((int[])obj[3])[v[10]]) | 1) != 0) {
                                                    if (v[11] >= 0 && v[11] < v[1] && v[12] >= 0 && v[12] < v[1] && grid[v[11]][v[12]] > 1) {
                                                        if (((v[8] = grid[v[11]][v[12]]) | 1) != 0 && ((v[9] = 1) | 1) != 0) {
                                                            if (v[10] > 0 && v[8] == ((int[])obj[4])[0]) { if (((v[9] = 0) | 1) != 0) {} }
                                                            if (v[10] > 1 && v[8] == ((int[])obj[4])[1]) { if (((v[9] = 0) | 1) != 0) {} }
                                                            if (v[10] > 2 && v[8] == ((int[])obj[4])[2]) { if (((v[9] = 0) | 1) != 0) {} }
                                                            if (v[9] == 1) {
                                                                if ((((int[])obj[4])[v[10]] = v[8]) != -1 && ((v[13] += ((int[])obj[1])[v[8]]) | 1) != 0) {}
                                                            } else {
                                                                if ((((int[])obj[4])[v[10]] = 0) == 0) {}
                                                            }
                                                        }
                                                    } else {
                                                        if ((((int[])obj[4])[v[10]] = 0) == 0) {}
                                                    }
                                                }
                                                if (((v[10] += 1) | 1) != 0) {}
                                            }
                                            if (((v[14] = Math.max(v[14], v[13])) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        } else {
                            if (System.getProperties().put("ans", v[14] == 0 ? v[1] * v[1] : v[14]) != null || true) {
                                if (((v[0] = 99) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int)System.getProperties().get("ans");
    }
}
