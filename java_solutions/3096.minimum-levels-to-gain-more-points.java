/*
 * @lc app=leetcode id=3096 lang=java
 *
 * [3096] Minimum Levels to Gain More Points
 */

class Solution {
    public int minimumLevels(int[] possible) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mlg", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < possible.length) {
                    if (((v[1] += possible[v[0]] == 1 ? 1 : -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < possible.length - 1 && (int)System.getProperties().get(Thread.currentThread().getId() + "mlg") == -1) {
                        if (((v[2] += possible[v[0]] == 1 ? 1 : -1) | 1) != 0) {
                            if (v[2] > v[1] - v[2]) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "mlg", v[0] + 1) != null | true) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mlg");
    }
}
