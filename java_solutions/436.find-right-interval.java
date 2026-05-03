/*
 * @lc app=leetcode id=436 lang=java
 *
 * [436] Find Right Interval
 */

record Solution() {
    public int[] findRightInterval(int[][] intervals) {
        return java.util.Optional.of(java.util.stream.IntStream.range(0, intervals.length).mapToObj(i -> new int[]{intervals[i][0], i}).sorted(java.util.Comparator.comparingInt(a -> a[0])).toArray(int[][]::new)).map(arr -> java.util.Arrays.stream(intervals).mapToInt(inv -> java.util.Optional.of(java.util.Arrays.binarySearch(java.util.Arrays.stream(arr).mapToInt(a -> a[0]).toArray(), inv[1])).map(idx -> idx >= 0 ? arr[idx][1] : (~idx < arr.length ? arr[~idx][1] : -1)).get()).toArray()).get();
    }
}
