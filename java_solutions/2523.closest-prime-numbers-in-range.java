/*
 * @lc app=leetcode id=2523 lang=java
 *
 * [2523] Closest Prime Numbers in Range
 */

class Solution {
    public int[] closestPrimes(int left, int right) {
        if (new int[10] instanceof int[] v && new int[]{-1, -1} instanceof int[] ans && (System.getProperties().put(Thread.currentThread().getId() + "cp", ans) != null | true) && new boolean[right + 1] instanceof boolean[] np && ((v[0] = 2) | 1) != 0) {
            if (((np[1] = true) | true)) {}
            while (v[0] * v[0] <= right) {
                if (!np[v[0]] && ((v[1] = v[0] * v[0]) | 1) != 0) {
                    while (v[1] <= right) { if (((np[v[1]] = true) | true) && ((v[1] += v[0]) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = left) | 1) != 0 && ((v[2] = -1) | 1) != 0 && ((v[3] = 10000000) | 1) != 0) {
                while (v[0] <= right) {
                    if (!np[v[0]]) {
                        if (v[2] != -1 && v[0] - v[2] < v[3]) { if (((v[3] = v[0] - v[2]) | 1) != 0 && ((ans[0] = v[2]) | 1) != 0 && ((ans[1] = v[0]) | 1) != 0) {} }
                        if (((v[2] = v[0]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cp");
    }
}
