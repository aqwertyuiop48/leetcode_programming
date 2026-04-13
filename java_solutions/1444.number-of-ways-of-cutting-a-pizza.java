/*
 * @lc app=leetcode id=1444 lang=java
 *
 * [1444] Number of Ways of Cutting a Pizza
 */

class Solution {
    public int ways(String[] pizza, int K) {
        if (new int[]{0, 1, 1, pizza.length, pizza[0].length(), 0, K, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[pizza.length + 1][pizza[0].length() + 1], new long[pizza.length + 1][pizza[0].length() + 1][K]} instanceof Object[] obj) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[1] <= v[3]) {
                        if (((v[5] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                            while (v[2] <= v[4]) {
                                if (pizza[v[1] - 1].charAt(v[2] - 1) == 'A') {
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                                if (((((int[][])obj[0])[v[1]][v[2]] = v[5] + ((int[][])obj[0])[v[1] - 1][v[2]]) | 1) != 0) {
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = v[3] - 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] >= 0) {
                        if (((v[2] = v[4] - 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(((long[][][])obj[1])[0][0][v[6] - 1])) != null || true) {
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[2] >= 0) {
                        if (((v[7] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[7] < v[6]) {
                        if (v[7] == 0) {
                            if (((int[][])obj[0])[v[3]][v[4]] + ((int[][])obj[0])[v[1]][v[2]] - ((int[][])obj[0])[v[3]][v[2]] - ((int[][])obj[0])[v[1]][v[4]] > 0) {
                                if ((((long[][][])obj[1])[v[1]][v[2]][0] = 1) != 0 || true) {}
                            }
                        } else {
                            if (((v[8] = 0) | 1) != 0 && ((v[9] = v[1]) | 1) != 0) {
                                while (v[9] < v[3] - 1) {
                                    if (((int[][])obj[0])[v[9] + 1][v[4]] + ((int[][])obj[0])[v[1]][v[2]] - ((int[][])obj[0])[v[9] + 1][v[2]] - ((int[][])obj[0])[v[1]][v[4]] > 0) {
                                        if (((v[8] = (int)((v[8] + ((long[][][])obj[1])[v[9] + 1][v[2]][v[7] - 1]) % 1000000007)) | 1) != 0) {}
                                    }
                                    if (((v[9] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[10] = v[2]) | 1) != 0) {
                                while (v[10] < v[4] - 1) {
                                    if (((int[][])obj[0])[v[3]][v[10] + 1] + ((int[][])obj[0])[v[1]][v[2]] - ((int[][])obj[0])[v[3]][v[2]] - ((int[][])obj[0])[v[1]][v[10] + 1] > 0) {
                                        if (((v[8] = (int)((v[8] + ((long[][][])obj[1])[v[1]][v[10] + 1][v[7] - 1]) % 1000000007)) | 1) != 0) {}
                                    }
                                    if (((v[10] += 1) | 1) != 0) {}
                                }
                            }
                            if ((((long[][][])obj[1])[v[1]][v[2]][v[7]] = v[8]) != 0 || true) {}
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[2] -= 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) Long.parseLong(System.getProperty("ans", "0"));
    }
}
