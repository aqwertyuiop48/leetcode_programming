/*
 * @lc app=leetcode id=3796 lang=java
 *
 * [3796] Find Maximum Value in a Constrained Sequence
 */

class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        if (new long[n] instanceof long[] limit && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fmv", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < n) { if (((limit[v[0]] = 2000000000000000000L) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((limit[0] = 0L) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < restrictions.length) {
                    if (restrictions[v[0]][1] < limit[restrictions[v[0]][0]]) { if (((limit[restrictions[v[0]][0]] = restrictions[v[0]][1]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < n) {
                    if (limit[v[0] - 1] + diff[v[0] - 1] < limit[v[0]]) { if (((limit[v[0]] = limit[v[0] - 1] + diff[v[0] - 1]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = n - 2) | 1) != 0) {
                while (v[0] >= 0) {
                    if (limit[v[0] + 1] + diff[v[0]] < limit[v[0]]) { if (((limit[v[0]] = limit[v[0] + 1] + diff[v[0]]) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && new long[1] instanceof long[] maxL) {
                while (v[0] < n) {
                    if (limit[v[0]] > maxL[0]) { if (((maxL[0] = limit[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fmv", (int)maxL[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fmv");
    }
}
