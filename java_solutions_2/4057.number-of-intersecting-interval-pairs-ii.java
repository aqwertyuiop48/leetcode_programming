/*
 * @lc app=leetcode id=4057 lang=java
 *
 * [4057] Number of Intersecting Interval Pairs II
 */

class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        return java.util.stream.Stream.of(java.util.stream.IntStream.range(0, intervals.length * 2).mapToObj(i -> new int[]{i % 2 == 0 ? intervals[i / 2][0] : intervals[i / 2][1], i % 2}).sorted((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])).reduce(new long[]{ (long) intervals.length * (intervals.length - 1) / 2, 0L }, (st, p) -> (long[]) new Object[]{ 0L, st[0] -= p[1] == 0 ? st[1] : 0, st[1] += p[1], st }[3], (a, b) -> a)).mapToLong(res -> res[0]).findFirst().getAsLong();
    }
}
