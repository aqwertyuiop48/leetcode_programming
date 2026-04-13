/*
 * @lc app=leetcode id=1735 lang=java
 *
 * [1735] Count Ways to Make Array With Product
 */

class Solution {
    public int[] waysToFillArray(int[][] queries) {
        if (new long[]{0, 2, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1000000007} instanceof long[] v && new Object[]{new int[10025], new long[10025], new long[10025], new int[queries.length]} instanceof Object[] obj) {
            while (v[0] < 20) {
                if (v[0] == 0) {
                    if (v[1] < 10025) {
                        if ((((int[])obj[0])[(int)v[1]] = (int)v[1]) != 0 || true) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = 2) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] * v[1] < 10025) {
                        if (((int[])obj[0])[(int)v[1]] == (int)v[1]) {
                            if (((v[2] = v[1] * v[1]) | 1) != 0 && ((v[0] = 11) | 1) != 0) {}
                        } else {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if ((((long[])obj[1])[0] = 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 11) {
                    if (v[2] < 10025) {
                        if (((int[])obj[0])[(int)v[2]] == (int)v[2]) {
                            if ((((int[])obj[0])[(int)v[2]] = (int)v[1]) != 0) {}
                        }
                        if (((v[2] += v[1]) | 1) != 0) {}
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[1] < 10025) {
                        if ((((long[])obj[1])[(int)v[1]] = (v[1] * ((long[])obj[1])[(int)v[1] - 1]) % v[11]) != 0 || true) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[8] = 1) | 1) != 0 && ((v[9] = ((long[])obj[1])[10024]) | 1) != 0 && ((v[10] = v[11] - 2) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[10] > 0) {
                        if ((v[10] & 1) == 1) {
                            if (((v[8] = (v[8] * v[9]) % v[11]) | 1) != 0) {}
                        }
                        if (((v[9] = (v[9] * v[9]) % v[11]) | 1) != 0 && ((v[10] >>= 1) | 1) != 0) {}
                    } else {
                        if ((((long[])obj[2])[10024] = v[8]) != 0 || true) {
                            if (((v[1] = 10023) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 5) {
                    if (v[1] >= 0) {
                        if ((((long[])obj[2])[(int)v[1]] = (((long[])obj[2])[(int)v[1] + 1] * (v[1] + 1)) % v[11]) != 0 || true) {
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                    }
                } else if (v[0] == 6) {
                    if (v[1] < queries.length) {
                        if (((v[3] = queries[(int)v[1]][0]) | 1) != 0 && ((v[4] = queries[(int)v[1]][1]) | 1) != 0 && ((v[7] = 1) | 1) != 0 && ((v[0] = 7) | 1) != 0) {}
                    } else {
                        if (((queries = new int[][]{(int[])obj[3]}) != null) && ((v[0] = 20) | 1) != 0) {}
                    }
                } else if (v[0] == 7) {
                    if (v[4] > 1) {
                        if (((v[5] = ((int[])obj[0])[(int)v[4]]) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[0] = 8) | 1) != 0) {}
                    } else {
                        if ((((int[])obj[3])[(int)v[1]] = (int)v[7]) != 0 || true) {
                            if (((v[1] += 1) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 8) {
                    if (v[4] % v[5] == 0) {
                        if (((v[4] /= v[5]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                    } else {
                        if (((v[7] = (v[7] * (((((long[])obj[1])[(int)(v[3] + v[6] - 1)] * ((long[])obj[2])[(int)(v[3] - 1)]) % v[11]) * ((long[])obj[2])[(int)v[6]] % v[11])) % v[11]) | 1) != 0) {
                            if (((v[0] = 7) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return queries[0];
    }
}
