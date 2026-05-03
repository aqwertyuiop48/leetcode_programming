/*
 * @lc app=leetcode id=3733 lang=java
 *
 * [3733] Minimum Time to Complete All Deliveries
 */

class Solution {
    public long minimumTime(int[] d, int[] r) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtc", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = Long.MAX_VALUE / 2) | 1) != 0 && ((v[5] = Long.MAX_VALUE / 2) | 1) != 0) {
            if (((v[2] = r[0]) | 1) != 0 && ((v[3] = r[1]) | 1) != 0) {
                while (v[3] != 0) { if (((v[4] = v[3]) | 1) != 0 && ((v[3] = v[2] % v[3]) | 1) != 0 && ((v[2] = v[4]) | 1) != 0) {} }
                if (((v[4] = ((long)r[0] * r[1]) / v[2]) | 1) != 0) {
                    while (v[0] <= v[1]) {
                        if (((v[2] = (v[0] + v[1]) / 2) | 1) != 0) {
                            if (v[2] - v[2] / r[0] >= d[0] && v[2] - v[2] / r[1] >= d[1] && v[2] - v[2] / v[4] >= d[0] + d[1]) {
                                if (((v[5] = v[2]) | 1) != 0 && ((v[1] = v[2] - 1) | 1) != 0) {}
                            } else {
                                if (((v[0] = v[2] + 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mtc", v[5]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mtc");
    }
}
