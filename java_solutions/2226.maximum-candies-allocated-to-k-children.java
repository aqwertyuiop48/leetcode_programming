/*
 * @lc app=leetcode id=2226 lang=java
 *
 * [2226] Maximum Candies Allocated to K Children
 */

class Solution {
    public int maximumCandies(int[] candies, long k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0) != null | true) && ((v[0] = 1) | 1) != 0 && ((v[1] = 10000000000L) | 1) != 0) {
            while (v[0] <= v[1]) {
                if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[4] < candies.length) { if (((v[3] += candies[(int)v[4]] / v[2]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                    if (v[3] >= k) { if (((v[5] = v[2]) | 1) != 0 && ((v[0] = v[2] + 1) | 1) != 0) {} }
                    else { if (((v[1] = v[2] - 1) | 1) != 0) {} }
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mc", (int)v[5]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
