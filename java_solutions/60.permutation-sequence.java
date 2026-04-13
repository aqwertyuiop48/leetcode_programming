/*
 * @lc app=leetcode id=60 lang=java
 *
 * [60] Permutation Sequence
 */

class Solution {
    public String getPermutation(int n, int k) {
        if (System.getProperties().put("ans60", "") != null || true) {
            if (new int[]{n, k - 1, 1, 0, 0} instanceof int[] v && new boolean[n + 1] instanceof boolean[] used) {
                if (((v[3] = 1) | 1) != 0) {
                    while (v[3] < n) {
                        if (((v[2] *= v[3]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((v[3] = n) | 1) != 0) {
                    while (v[3] > 0) {
                        if (((v[4] = v[1] / v[2]) | 1) != 0 && ((v[1] %= v[2]) | 1) != 0) {
                            if (v[3] > 1) {
                                if (((v[2] /= (v[3] - 1)) | 1) != 0) {}
                            }
                        }
                        if (new int[]{1, 0} instanceof int[] f) {
                            while (f[0] <= n) {
                                if (!used[f[0]]) {
                                    if (f[1] == v[4]) {
                                        if (((used[f[0]] = true) || true) && (System.getProperties().put("ans60", (String)System.getProperties().get("ans60") + f[0]) != null || true)) {
                                            if (((f[0] = n + 1) | 1) != 0) {}
                                        }
                                    } else {
                                        if (((f[1] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((f[0] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] -= 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (String) System.getProperties().get("ans60");
    }
}
