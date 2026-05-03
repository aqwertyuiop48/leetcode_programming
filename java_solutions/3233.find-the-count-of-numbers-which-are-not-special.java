/*
 * @lc app=leetcode id=3233 lang=java
 *
 * [3233] Find the Count of Numbers Which Are Not Special
 */

class Solution {
    public int nonSpecialCount(int l, int r) {
        if (new int[5] instanceof int[] v && new boolean[31625] instanceof boolean[] isP && (System.getProperties().put(Thread.currentThread().getId() + "nsc", 0) != null | true)) {
            if (((v[0] = 2) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] * v[0] <= r) {
                    if (!isP[v[0]]) {
                        if (v[0] * v[0] >= l) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((v[2] = v[0] * v[0]) | 1) != 0) {
                            while (v[2] <= 31622) {
                                // Fixed Line: Boolean assignment chained with &&
                                if ((isP[v[2]] = true) && ((v[2] += v[0]) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nsc", (r - l + 1) - v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nsc");
    }
}
