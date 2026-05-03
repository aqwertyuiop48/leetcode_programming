/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

record Solution() {
    public int eraseOverlapIntervals(int[][] intervals) {
        return intervals.length - java.util.Optional.of(java.util.Arrays.stream(intervals).sorted(java.util.Comparator.comparingInt(a -> a[1])).toArray(int[][]::new)).map(arr -> java.util.stream.IntStream.range(1, arr.length).boxed().reduce(new int[]{arr[0][1], 1}, (s, i) -> arr[i][0] >= s[0] ? new int[]{arr[i][1], s[1] + 1} : s, (a, b) -> a)[1]).orElse(0);
    }
}
