/*
 * @lc app=leetcode id=1377 lang=java
 *
 * [1377] Frog Position After T Seconds
 */

class Solution {
    public double frogPosition(int n, int[][] edges, int t, int target) {
        if (new int[]{0, n, t, target, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[n + 1], new int[edges.length * 2], new int[edges.length * 2], new int[n + 5], new double[n + 1], new int[n + 1]} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) { 
                    if (((v[4] = 1) | 1) != 0) {
                        while (v[4] <= n) {
                            if ((((int[])obj[0])[v[4]] = -1) != 0 || true) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) { 
                    if (v[4] < edges.length) {
                        if (((v[6] = edges[v[4]][0]) | 1) != 0 && ((v[7] = edges[v[4]][1]) | 1) != 0) {
                            if ((((int[])obj[1])[v[5]] = v[7]) != 0 || true) {
                                if ((((int[])obj[2])[v[5]] = ((int[])obj[0])[v[6]]) != 0 || true) {
                                    if ((((int[])obj[0])[v[6]] = v[5]++) != 0 || true) {}
                                }
                            }
                            if ((((int[])obj[1])[v[5]] = v[6]) != 0 || true) {
                                if ((((int[])obj[2])[v[5]] = ((int[])obj[0])[v[7]]) != 0 || true) {
                                    if ((((int[])obj[0])[v[7]] = v[5]++) != 0 || true) {}
                                }
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[8] = 0) | 1) != 0 && ((v[9] = 0) | 1) != 0) { 
                            if ((((int[])obj[3])[v[9]++] = 1) != 0 || true) { 
                                if ((((double[])obj[4])[1] = 1.0) != 0 || true) { 
                                    if (((v[0] = 2) | 1) != 0) {}
                                }
                            }
                        }
                    }
                } else if (v[0] == 2) { 
                    if (v[8] < v[9]) {
                        if (((v[10] = ((int[])obj[3])[v[8]++]) | 1) != 0) { 
                            if (((int[])obj[5])[v[10]] < t) {
                                if (((v[11] = 0) | 1) != 0 && ((v[12] = ((int[])obj[0])[v[10]]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {} 
                            } else {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (System.setProperty("ans", String.valueOf(((double[])obj[4])[target])) != null || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 3) { 
                    if (v[12] != -1) {
                        if (((int[])obj[5])[((int[])obj[1])[v[12]]] == 0 && ((int[])obj[1])[v[12]] != 1) { 
                            if (((v[11] += 1) | 1) != 0) {}
                        }
                        if (((v[12] = ((int[])obj[2])[v[12]]) | 1) != 0) {}
                    } else {
                        if (v[11] > 0) {
                            if (((v[12] = ((int[])obj[0])[v[10]]) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                        } else {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 4) { 
                    if (v[12] != -1) {
                        if (((int[])obj[5])[((int[])obj[1])[v[12]]] == 0 && ((int[])obj[1])[v[12]] != 1) { 
                            if ((((double[])obj[4])[((int[])obj[1])[v[12]]] = ((double[])obj[4])[v[10]] / v[11]) != 0 || true) {
                                if ((((int[])obj[5])[((int[])obj[1])[v[12]]] = ((int[])obj[5])[v[10]] + 1) != 0 || true) {
                                    if ((((int[])obj[3])[v[9]++] = ((int[])obj[1])[v[12]]) != 0 || true) {}
                                }
                            }
                        }
                        if (((v[12] = ((int[])obj[2])[v[12]]) | 1) != 0) {}
                    } else {
                        if ((((double[])obj[4])[v[10]] = 0.0) == 0.0 || true) { 
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Double.parseDouble(System.getProperty("ans", "0"));
    }
}
