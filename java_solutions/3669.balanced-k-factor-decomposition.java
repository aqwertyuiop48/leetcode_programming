/*
 * @lc app=leetcode id=3669 lang=java
 *
 * [3669] Balanced K-Factor Decomposition
 */

class Solution {
    public int[] minDifference(int n, int k) {
        if (new int[k] instanceof int[] f && new int[k + 1] instanceof int[] rem && new int[10] instanceof int[] v && new int[k] instanceof int[] ans && (System.getProperties().put(Thread.currentThread().getId() + "bkf", ans) != null | true)) {
            if (((rem[0] = n) | 1) != 0 && ((f[0] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0) {
                while (v[0] >= 0) {
                    if (v[0] == k - 1) {
                        if (rem[v[0]] >= f[v[0]]) {
                            if (((f[v[0]] = rem[v[0]]) | 1) != 0 && ((v[2] = f[0]) | 1) != 0 && ((v[3] = f[v[0]]) | 1) != 0) {
                                if (v[3] - v[2] < v[1]) {
                                    if (((v[1] = v[3] - v[2]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                        while (v[4] < k) { if (((ans[v[4]] = f[v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                                    }
                                }
                            }
                        }
                        if (((v[0] -= 1) | 1) != 0) {
                            if (v[0] >= 0) { if (((f[v[0]] += 1) | 1) != 0) {} }
                        }
                    } else {
                        while (f[v[0]] <= rem[v[0]] && rem[v[0]] % f[v[0]] != 0) { if (((f[v[0]] += 1) | 1) != 0) {} }
                        if (((v[5] = 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[6] < k - v[0]) {
                                if ((long)v[5] * f[v[0]] > rem[v[0]]) { 
                                    if (((v[5] = rem[v[0]] + 1) | 1) != 0 && ((v[6] = k) | 1) != 0) {} 
                                } else {
                                    if (((v[5] *= f[v[0]]) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[5] > rem[v[0]]) {
                                if (((v[0] -= 1) | 1) != 0) {
                                    if (v[0] >= 0) { if (((f[v[0]] += 1) | 1) != 0) {} }
                                }
                            } else {
                                if (((rem[v[0] + 1] = rem[v[0]] / f[v[0]]) | 1) != 0 && ((f[v[0] + 1] = f[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "bkf");
    }
}
