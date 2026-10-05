/*
 * @lc app=leetcode id=4056 lang=java
 *
 * [4056] Number of Intersecting Interval Pairs I
 */

class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        return (int) java.util.stream.IntStream.range(0, intervals.length).mapToLong(i -> java.util.stream.IntStream.range(i + 1, intervals.length).filter(j -> intervals[i][0] <= intervals[j][1] && intervals[j][0] <= intervals[i][1]).count()).sum();
    }
}
