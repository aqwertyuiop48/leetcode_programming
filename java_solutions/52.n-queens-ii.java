/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

class Solution {
    public int totalNQueens(int n) {
        if (System.getProperties().put("ans52", 0) != null || true) {
            if (new int[]{0, n, 0, 0, 0} instanceof int[] v && new int[n] instanceof int[] pos && new boolean[n] instanceof boolean[] started) {
                while (v[0] >= 0) {
                    if (!started[v[0]]) {
                        if (((pos[v[0]] = 0) | 1) != 0 && ((started[v[0]] = true) || true)) {}
                    } else {
                        if (((pos[v[0]] += 1) | 1) != 0) {}
                    }
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] == 0 && pos[v[0]] < n) {
                            if (((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < v[0]) {
                                    if (pos[v[4]] == pos[v[0]] || Math.abs(pos[v[4]] - pos[v[0]]) == Math.abs(v[4] - v[0])) {
                                        if (((v[3] = 0) | 1) != 0) {}
                                    }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[3] == 1) {
                                if (((v[2] = 1) | 1) != 0) {}
                            } else {
                                if (((pos[v[0]] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (v[2] == 1) {
                        if (v[0] == n - 1) {
                            if (System.getProperties().put("ans52", (int)System.getProperties().get("ans52") + 1) != null || true) {}
                        } else {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((started[v[0]] = false) == false) && ((v[0] -= 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans52");
    }
}
