/*
 * @lc app=leetcode id=1383 lang=java
 *
 * [1383] Maximum Performance of a Team
 */

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        if (new long[]{0, n, k, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof long[] v && new Object[]{new long[n], new long[k + 1]} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[3] < n) {
                        if (((((long[])obj[0])[(int)v[3]] = ((long)efficiency[(int)v[3]] << 32) | speed[(int)v[3]]) != 0 || true) && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((obj[0] = Arrays.stream((long[])obj[0]).sorted().toArray()) != null) || true) {
                            if (((v[3] = n - 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) { 
                    if (v[3] >= 0) {
                        if (((v[4] = (int)(((long[])obj[0])[(int)v[3]])) | 1) != 0 && ((v[5] = (int)(((long[])obj[0])[(int)v[3]] >> 32)) | 1) != 0) {
                            if (v[6] == k) { 
                                if (((v[7] -= ((long[])obj[1])[1]) | 1) != 0) { 
                                    if ((((long[])obj[1])[1] = ((long[])obj[1])[(int)v[6]--]) != 0 || true) {
                                        if (((v[8] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {} 
                                    }
                                }
                            } else {
                                if (((v[0] = 3) | 1) != 0) {} 
                            }
                        }
                    } else {
                        if (((n = (int)(v[10] % 1000000007)) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 2) { 
                    if (v[8] * 2 <= v[6]) {
                        if (((v[9] = v[8] * 2) | 1) != 0) {
                            if (v[9] < v[6] && ((long[])obj[1])[(int)v[9] + 1] < ((long[])obj[1])[(int)v[9]]) {
                                if (((v[9] += 1) | 1) != 0) {}
                            }
                            if (((long[])obj[1])[(int)v[8]] <= ((long[])obj[1])[(int)v[9]]) {
                                if (((v[0] = 3) | 1) != 0) {}
                            } else {
                                if (((v[11] = ((long[])obj[1])[(int)v[8]]) | 1) != 0 && ((((long[])obj[1])[(int)v[8]] = ((long[])obj[1])[(int)v[9]]) != 0 || true) && ((((long[])obj[1])[(int)v[9]] = v[11]) != 0 || true)) {
                                    if (((v[8] = v[9]) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) { 
                    if (((v[6] += 1) | 1) != 0 && ((((long[])obj[1])[(int)v[6]] = v[4]) != 0 || true) && ((v[7] += v[4]) | 1) != 0 && ((v[8] = v[6]) | 1) != 0 && ((v[10] = Math.max(v[10], v[7] * v[5])) | 1) != 0) {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) { 
                    if (v[8] > 1 && ((long[])obj[1])[(int)v[8]] < ((long[])obj[1])[(int)(v[8] / 2)]) {
                        if (((v[11] = ((long[])obj[1])[(int)v[8]]) | 1) != 0 && ((((long[])obj[1])[(int)v[8]] = ((long[])obj[1])[(int)(v[8] / 2)]) != 0 || true) && ((((long[])obj[1])[(int)(v[8] / 2)] = v[11]) != 0 || true)) {
                            if (((v[8] /= 2) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] -= 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return n;
    }
}
