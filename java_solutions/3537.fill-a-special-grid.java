/*
 * @lc app=leetcode id=3537 lang=java
 *
 * [3537] Fill a Special Grid
 */

class Solution {
    public int[][] specialGrid(int n) {
        if (new int[1 << n][1 << n] instanceof int[][] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sg", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < (1 << n)) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < (1 << n)) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                while (v[2] < n) {
                                    if (((v[4] = (v[0] >> v[2]) & 1) | 1) != 0 && ((v[5] = (v[1] >> v[2]) & 1) | 1) != 0) {
                                        if (((v[3] += (((1 - v[5]) << 1) | (v[4] ^ (1 - v[5]))) * (1 << (2 * v[2]))) | 1) != 0) {}
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (((ans[v[0]][v[1]] = v[3]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[][]) System.getProperties().get(Thread.currentThread().getId() + "sg");
    }
}
