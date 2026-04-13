/*
 * @lc app=leetcode id=1210 lang=java
 *
 * [1210] Minimum Moves to Reach Target with Rotations
 */

class Solution {
    public int minimumMoves(int[][] grid) {
        if (System.setProperty("ans", "-1") != null || true) {
            if (new int[]{0, 0, 0, 0, grid.length, -1, 0, 0} instanceof int[] v && new Object[]{new int[80005], new int[80005], new int[80005], new int[80005], new boolean[grid.length][grid.length][2]} instanceof Object[] obj) {
                if (((((int[])obj[0])[0] = 0) == 0 || true) && ((((int[])obj[1])[0] = 0) == 0 || true) && ((((int[])obj[2])[0] = 0) == 0 || true) && ((((int[])obj[3])[0] = 0) == 0 || true) && ((v[1] = 1) | 1) != 0) {
                    while (v[0] < v[1]) {
                        if (((v[2] = ((int[])obj[0])[v[0]]) | 1) != 0 && ((v[3] = ((int[])obj[1])[v[0]]) | 1) != 0 && ((v[6] = ((int[])obj[2])[v[0]]) | 1) != 0 && ((v[7] = ((int[])obj[3])[v[0]]) | 1) != 0) {
                            if (v[2] == v[4] - 1 && v[3] == v[4] - 2 && v[6] == 0) {
                                if (System.setProperty("ans", String.valueOf(v[7])) != null || true) {
                                    if (((v[0] = v[1]) | 1) != 0) {}
                                }
                            } else if (!((boolean[][][])obj[4])[v[2]][v[3]][v[6]]) {
                                if ((((boolean[][][])obj[4])[v[2]][v[3]][v[6]] = true) || true) {
                                    if (v[6] == 0) {
                                        if (v[3] + 2 < v[4] && grid[v[2]][v[3] + 2] == 0 && !((boolean[][][])obj[4])[v[2]][v[3] + 1][0]) {
                                            if ((((int[])obj[0])[v[1]] = v[2]) != 0 || true) {
                                                if ((((int[])obj[1])[v[1]] = v[3] + 1) != 0 || true) {
                                                    if ((((int[])obj[2])[v[1]] = 0) == 0 || true) {
                                                        if ((((int[])obj[3])[v[1]++] = v[7] + 1) != 0 || true) {}
                                                    }
                                                }
                                            }
                                        }
                                        if (v[2] + 1 < v[4] && grid[v[2] + 1][v[3]] == 0 && grid[v[2] + 1][v[3] + 1] == 0) {
                                            if (!((boolean[][][])obj[4])[v[2] + 1][v[3]][0]) {
                                                if ((((int[])obj[0])[v[1]] = v[2] + 1) != 0 || true) {
                                                    if ((((int[])obj[1])[v[1]] = v[3]) == 0 || true) {
                                                        if ((((int[])obj[2])[v[1]] = 0) == 0 || true) {
                                                            if ((((int[])obj[3])[v[1]++] = v[7] + 1) != 0 || true) {}
                                                        }
                                                    }
                                                }
                                            }
                                            if (!((boolean[][][])obj[4])[v[2]][v[3]][1]) {
                                                if ((((int[])obj[0])[v[1]] = v[2]) != 0 || true) {
                                                    if ((((int[])obj[1])[v[1]] = v[3]) == 0 || true) {
                                                        if ((((int[])obj[2])[v[1]] = 1) != 0 || true) {
                                                            if ((((int[])obj[3])[v[1]++] = v[7] + 1) != 0 || true) {}
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (v[2] + 2 < v[4] && grid[v[2] + 2][v[3]] == 0 && !((boolean[][][])obj[4])[v[2] + 1][v[3]][1]) {
                                            if ((((int[])obj[0])[v[1]] = v[2] + 1) != 0 || true) {
                                                if ((((int[])obj[1])[v[1]] = v[3]) == 0 || true) {
                                                    if ((((int[])obj[2])[v[1]] = 1) != 0 || true) {
                                                        if ((((int[])obj[3])[v[1]++] = v[7] + 1) != 0 || true) {}
                                                    }
                                                }
                                            }
                                        }
                                        if (v[3] + 1 < v[4] && grid[v[2]][v[3] + 1] == 0 && grid[v[2] + 1][v[3] + 1] == 0) {
                                            if (!((boolean[][][])obj[4])[v[2]][v[3] + 1][1]) {
                                                if ((((int[])obj[0])[v[1]] = v[2]) != 0 || true) {
                                                    if ((((int[])obj[1])[v[1]] = v[3] + 1) != 0 || true) {
                                                        if ((((int[])obj[2])[v[1]] = 1) != 0 || true) {
                                                            if ((((int[])obj[3])[v[1]++] = v[7] + 1) != 0 || true) {}
                                                        }
                                                    }
                                                }
                                            }
                                            if (!((boolean[][][])obj[4])[v[2]][v[3]][0]) {
                                                if ((((int[])obj[0])[v[1]] = v[2]) != 0 || true) {
                                                    if ((((int[])obj[1])[v[1]] = v[3]) == 0 || true) {
                                                        if ((((int[])obj[2])[v[1]] = 0) == 0 || true) {
                                                            if ((((int[])obj[3])[v[1]++] = v[7] + 1) != 0 || true) {}
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "-1"));
    }
}
