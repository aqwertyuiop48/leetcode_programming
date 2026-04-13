/*
 * @lc app=leetcode id=1510 lang=java
 *
 * [1510] Stone Game IV
 */

class Solution {
    public boolean winnerSquareGame(int n) {
        if (new int[]{1, 1, 0} instanceof int[] v && new boolean[n + 1] instanceof boolean[] winner) {
            while (v[0] <= n) {
                if (v[2] == 0) {
                    if (((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                } else if (v[2] == 1) {
                    if (v[1] * v[1] <= v[0]) {
                        if (!winner[v[0] - v[1] * v[1]]) {
                            if ((winner[v[0]] = true) || true) {
                                if (((v[2] = 2) | 1) != 0) {}
                            }
                        } else {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[2] = 2) | 1) != 0) {}
                    }
                } else if (v[2] == 2) {
                    if (((v[0] += 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                }
            }
            if (((n = winner[n] ? 1 : 0) | 1) != 0) {}
        }
        return n == 1;
    }
}
