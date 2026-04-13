/*
 * @lc app=leetcode id=600 lang=java
 *
 * [600] Non-negative Integers without Consecutive Ones
 */

class Solution {
    public int findIntegers(int n) {
        if (new int[]{0, 29, 0, 0, 0} instanceof int[] v && new int[32] instanceof int[] f) {
            if (((f[0] = 1) | 1) != 0 && ((f[1] = 2) | 1) != 0 && ((v[0] = 2) | 1) != 0) {
                while (v[0] < 32) {
                    if (((f[v[0]] = f[v[0]-1] + f[v[0]-2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                while (v[1] >= 0) {
                    if ((n & (1 << v[1])) != 0) {
                        if (((v[2] += f[v[1]]) | 1) != 0) {
                            if (v[3] == 1) {
                                if (((v[4] = 1) | 1) != 0 && ((v[1] = -1) | 1) != 0) {}
                            } else {
                                if (((v[3] = 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[3] = 0) | 1) != 0) {}
                    }
                    if (v[1] >= 0 && ((v[1] -= 1) | 1) != 0) {}
                }
                if (v[4] == 0) {
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
            if (((n = v[2]) | 1) != 0) {}
        }
        return n;
    }
}
