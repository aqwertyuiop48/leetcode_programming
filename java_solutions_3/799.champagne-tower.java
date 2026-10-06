/*
 * @lc app=leetcode id=799 lang=java
 *
 * [799] Champagne Tower
 */

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        return Math.min(1, java.util.stream.Stream.iterate(new double[]{poured}, r -> java.util.stream.IntStream.rangeClosed(0, r.length)
            .mapToDouble(j -> (j > 0 ? Math.max(0, (r[j - 1] - 1) / 2) : 0) + (j < r.length ? Math.max(0, (r[j] - 1) / 2) : 0)).toArray()).skip(query_row).findFirst().get()[query_glass]);
    }
}
