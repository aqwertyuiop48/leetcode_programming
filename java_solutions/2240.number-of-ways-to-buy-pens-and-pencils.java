/*
 * @lc app=leetcode id=2240 lang=java
 *
 * [2240] Number of Ways to Buy Pens and Pencils
 */

class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "wtb", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] * cost1 <= total) {
                if (((v[1] += (total - v[0] * cost1) / cost2 + 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "wtb", v[1]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "wtb");
    }
}
