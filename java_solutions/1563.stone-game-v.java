/*
 * @lc app=leetcode id=1563 lang=java
 *
 * [1563] Stone Game V
 */

class Solution {
    public int stoneGameV(int[] stoneValue) {
        if (new int[]{0, 1, 0, 0, 0, 0, stoneValue.length, 0, 0} instanceof int[] v && new Object[]{new int[stoneValue.length + 1], new int[stoneValue.length][stoneValue.length]} instanceof Object[] obj) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] <= v[6]) {
                        if ((((int[])obj[0])[v[1]] = ((int[])obj[0])[v[1] - 1] + stoneValue[v[1] - 1]) != 0 || true) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = 1) | 1) != 0) {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[1] < v[6]) {
                        if (((v[2] = 0) | 1) != 0) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    } else {
                        if (((stoneValue[0] = ((int[][])obj[1])[0][v[6] - 1]) | 1) != 0) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[2] < v[6] - v[1]) {
                        if (((v[3] = v[2] + v[1]) | 1) != 0) {
                            if (((v[4] = 0) | 1) != 0) {
                                if (((v[5] = v[2]) | 1) != 0) {
                                    if (((v[0] = 3) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0) {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 3) {
                    if (v[5] < v[3]) {
                        if (((v[7] = ((int[])obj[0])[v[5] + 1] - ((int[])obj[0])[v[2]]) | 1) != 0) {
                            if (((v[8] = ((int[])obj[0])[v[3] + 1] - ((int[])obj[0])[v[5] + 1]) | 1) != 0) {
                                if (v[7] < v[8]) {
                                    if (((v[4] = Math.max(v[4], v[7] + ((int[][])obj[1])[v[2]][v[5]])) | 1) != 0) {}
                                } else if (v[7] > v[8]) {
                                    if (((v[4] = Math.max(v[4], v[8] + ((int[][])obj[1])[v[5] + 1][v[3]])) | 1) != 0) {}
                                } else {
                                    if (((v[4] = Math.max(v[4], Math.max(v[7] + ((int[][])obj[1])[v[2]][v[5]], v[8] + ((int[][])obj[1])[v[5] + 1][v[3]]))) | 1) != 0) {}
                                }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if ((((int[][])obj[1])[v[2]][v[3]] = v[4]) != 0 || true) {
                            if (((v[2] += 1) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return stoneValue[0];
    }
}
