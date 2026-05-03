/*
 * @lc app=leetcode id=3881 lang=java
 *
 * [3881] Direction Assignments with Exactly K Visible People
 */

class Solution {
    public int countVisiblePeople(int n, int pos, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ca", 0) != null | true) && ((v[0] = pos) | 1) != 0 && ((v[1] = n - pos - 1) | 1) != 0 && new long[n + 1] instanceof long[] f && new long[n + 1] instanceof long[] invF) {
            if (((f[0] = 1) | 1) != 0 && ((invF[0] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[2] <= n) {
                    if (((f[v[2]] = (f[v[2] - 1] * v[2]) % 1000000007) | 1) != 0 && ((v[3] = (int)f[v[2]]) | 1) != 0 && ((v[4] = 1000000005) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                        while (v[4] > 0) {
                            if (v[4] % 2 == 1) { if (((v[5] = (int)(((long)v[5] * v[3]) % 1000000007)) | 1) != 0) {} }
                            if (((v[3] = (int)(((long)v[3] * v[3]) % 1000000007)) | 1) != 0 && ((v[4] /= 2) | 1) != 0) {}
                        }
                        if (((invF[v[2]] = v[5]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[2] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                    while (v[2] <= Math.min(k, v[0])) {
                        if (((v[3] = k - v[2]) | 1) != 0 && v[3] <= v[1]) {
                            if (((v[4] = (int)((f[v[0]] * invF[v[2]]) % 1000000007 * invF[v[0] - v[2]] % 1000000007)) | 1) != 0) {
                                if (((v[5] = (int)((f[v[1]] * invF[v[3]]) % 1000000007 * invF[v[1] - v[3]] % 1000000007)) | 1) != 0) {
                                    if (((v[6] = (int)((v[6] + 2L * v[4] * v[5]) % 1000000007)) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ca", v[6]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ca");
    }
}
