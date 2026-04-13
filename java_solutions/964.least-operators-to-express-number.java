/*
 * @lc app=leetcode id=964 lang=java
 *
 * [964] Least Operators to Express Number
 */

class Solution {
    public int leastOpsExpressTarget(int x, int y) {
        if (new int[]{0, y, 0, 0, 0, 0, 0, 0, x} instanceof int[] v) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] > 0) {
                        if (((v[7] = v[1] % v[8]) | 1) != 0 && ((v[1] /= v[8]) | 1) != 0) {
                            if (v[4] > 0) {
                                if (((v[5] = Math.min(v[7] * v[4] + v[2], (v[7] + 1) * v[4] + v[3])) | 1) != 0) {
                                    if (((v[6] = Math.min((v[8] - v[7]) * v[4] + v[2], (v[8] - v[7] - 1) * v[4] + v[3])) | 1) != 0) {
                                        if (((v[2] = v[5]) | 1) != 0 && ((v[3] = v[6]) | 1) != 0) {}
                                    }
                                }
                            } else {
                                if (((v[2] = v[7] * 2) | 1) != 0 && ((v[3] = (v[8] - v[7]) * 2) | 1) != 0) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((y = Math.min(v[2], v[4] + v[3]) - 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return y;
    }
}
