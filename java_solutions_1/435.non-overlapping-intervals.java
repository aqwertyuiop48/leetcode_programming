/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        return intervals.length == 0 ? 0 : java.util.stream.Stream.of(0).peek(_v -> java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]))).map(_v -> java.util.Arrays.stream(intervals).skip(1).reduce(new int[]{intervals[0][1], 0}, (state, next) -> next[0] < state[0] ? new int[]{state[0], state[1] + 1} : new int[]{next[1], state[1]}, (a, b) -> b)[1]).findFirst().get();
    }
}
