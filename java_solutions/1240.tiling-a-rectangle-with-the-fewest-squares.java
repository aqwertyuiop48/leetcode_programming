/*
 * @lc app=leetcode id=1240 lang=java
 *
 * [1240] Tiling a Rectangle with the Fewest Squares
 */

class Solution {
    public int tilingRectangle(int m, int n) {
        if (new int[]{0, m * n, m, n, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[15][15], new int[200], new int[200], new int[200], new int[200], new int[200]} instanceof Object[] obj) {
            while (v[0] >= 0) {
                if (((int[])obj[5])[v[0]] >= v[1]) {
                    if (((v[0] -= 1) | 1) != 0) {}
                } else if (((int[])obj[1])[v[0]] == 0) {
                    if (((v[4] = -1) | 1) != 0 && ((v[5] = -1) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                        while (v[8] < v[2]) {
                            if (((v[9] = 0) | 1) != 0) {
                                while (v[9] < v[3]) {
                                    if (((int[][])obj[0])[v[8]][v[9]] == 0) {
                                        if (((v[4] = v[8]) | 1) != 0 && ((v[5] = v[9]) | 1) != 0) {}
                                    }
                                    if (v[4] != -1) {
                                        if (((v[9] = v[3]) | 1) != 0) {}
                                    } else {
                                        if (((v[9] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (v[4] != -1) {
                                if (((v[8] = v[2]) | 1) != 0) {}
                            } else {
                                if (((v[8] += 1) | 1) != 0) {}
                            }
                        }
                        if (v[4] == -1) {
                            if (((v[1] = Math.min(v[1], ((int[])obj[5])[v[0]])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                        } else {
                            if ((((int[])obj[2])[v[0]] = v[4]) != 0 || true) {
                                if ((((int[])obj[3])[v[0]] = v[5]) != 0 || true) {
                                    if (((v[6] = 1) | 1) != 0 && ((v[10] = 0) | 1) != 0) {
                                        while (v[4] + v[6] <= v[2] && v[5] + v[6] <= v[3] && v[10] == 0) {
                                            if (((v[7] = 1) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                                                while (v[8] < v[6]) {
                                                    if (((int[][])obj[0])[v[4] + v[8]][v[5] + v[6] - 1] == 1 || ((int[][])obj[0])[v[4] + v[6] - 1][v[5] + v[8]] == 1) {
                                                        if (((v[7] = 0) | 1) != 0 && ((v[8] = v[6]) | 1) != 0) {}
                                                    } else {
                                                        if (((v[8] += 1) | 1) != 0) {}
                                                    }
                                                }
                                                if (v[7] == 0) {
                                                    if (((v[10] = 1) | 1) != 0) {}
                                                } else {
                                                    if (((v[6] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                        if ((((int[])obj[4])[v[0]] = v[6] - 1) != 0 || true) {
                                            if ((((int[])obj[1])[v[0]] = 1) != 0 || true) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (((int[])obj[1])[v[0]] == 1) {
                    if (((int[])obj[4])[v[0]] >= 1) {
                        if (((v[8] = ((int[])obj[2])[v[0]]) | 1) != 0) {
                            while (v[8] < ((int[])obj[2])[v[0]] + ((int[])obj[4])[v[0]]) {
                                if (((v[9] = ((int[])obj[3])[v[0]]) | 1) != 0) {
                                    while (v[9] < ((int[])obj[3])[v[0]] + ((int[])obj[4])[v[0]]) {
                                        if ((((int[][])obj[0])[v[8]][v[9]] = 1) != 0 || true) {
                                            if (((v[9] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[8] += 1) | 1) != 0) {}
                            }
                            if ((((int[])obj[1])[v[0]] = 2) != 0 || true) {
                                if (((v[0] += 1) | 1) != 0) {
                                    if ((((int[])obj[5])[v[0]] = ((int[])obj[5])[v[0] - 1] + 1) != 0 || true) {
                                        if ((((int[])obj[1])[v[0]] = 0) != 0 || true) {}
                                    }
                                }
                            }
                        }
                    } else {
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                } else if (((int[])obj[1])[v[0]] == 2) {
                    if (((v[8] = ((int[])obj[2])[v[0]]) | 1) != 0) {
                        while (v[8] < ((int[])obj[2])[v[0]] + ((int[])obj[4])[v[0]]) {
                            if (((v[9] = ((int[])obj[3])[v[0]]) | 1) != 0) {
                                while (v[9] < ((int[])obj[3])[v[0]] + ((int[])obj[4])[v[0]]) {
                                    if ((((int[][])obj[0])[v[8]][v[9]] = 0) == 0 || true) {
                                        if (((v[9] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[8] += 1) | 1) != 0) {}
                        }
                        if ((((int[])obj[4])[v[0]] -= 1) != 0 || true) {
                            if ((((int[])obj[1])[v[0]] = 1) != 0 || true) {}
                        }
                    }
                }
            }
            if (System.setProperty("ans", String.valueOf(v[1])) != null || true) {}
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
