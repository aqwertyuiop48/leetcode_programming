/*
 * @lc app=leetcode id=2222 lang=java
 *
 * [2222] Number of Ways to Select Buildings
 */

class Solution {
    public long numberOfWays(String s) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "nw", 0L) != null | true) && ((v[6] = 0) | 1) != 0) {
            while (v[6] < s.length()) {
                if (s.charAt((int)v[6]) == '0') {
                    if (((v[4] += v[2]) | 1) != 0 && ((v[3] += v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                } else {
                    if (((v[5] += v[3]) | 1) != 0 && ((v[2] += v[0]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                }
                if (((v[6] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "nw", v[4] + v[5]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "nw");
    }
}
