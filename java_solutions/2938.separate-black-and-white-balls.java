/*
 * @lc app=leetcode id=2938 lang=java
 *
 * [2938] Separate Black and White Balls
 */

class Solution {
    public long minimumSteps(String s) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (s.charAt((int)v[0]) == '1') { if (((v[1] += 1) | 1) != 0) {} }
                else { if (((v[2] += v[1]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ms", v[2]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
