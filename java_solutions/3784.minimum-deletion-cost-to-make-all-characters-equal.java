/*
 * @lc app=leetcode id=3784 lang=java
 *
 * [3784] Minimum Deletion Cost to Make All Characters Equal
 */

class Solution {
    public long minCost(String s, int[] cost) {
        if (new long[26] instanceof long[] m && new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (((v[1] = s.charAt((int)v[0]) - 'a') | 1) != 0 && ((m[(int)v[1]] += cost[(int)v[0]]) | 1) != 0) {
                    if (m[(int)v[1]] > v[2]) { if (((v[2] = m[(int)v[1]]) | 1) != 0) {} }
                    if (((v[3] += cost[(int)v[0]]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mc", v[3] - v[2]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
