/*
 * @lc app=leetcode id=2187 lang=java
 *
 * [2187] Minimum Time to Complete Trips
 */

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mt", 0L) != null | true) && ((v[0] = 1) | 1) != 0 && ((v[1] = 100000000000000L) | 1) != 0) {
            while (v[0] <= v[1]) {
                if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[4] < time.length) { if (((v[3] += v[2] / time[(int)v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                    if (v[3] >= totalTrips) { if (((v[5] = v[2]) | 1) != 0 && ((v[1] = v[2] - 1) | 1) != 0) {} }
                    else { if (((v[0] = v[2] + 1) | 1) != 0) {} }
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mt", v[5]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mt");
    }
}
