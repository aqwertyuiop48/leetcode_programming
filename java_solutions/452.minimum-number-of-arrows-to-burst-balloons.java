/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

record Solution() {
    public int findMinArrowShots(int[][] points) {
        return java.util.Optional.of(java.util.Arrays.stream(points).sorted(java.util.Comparator.comparingInt(a -> a[1])).toArray(int[][]::new)).map(arr -> java.util.stream.IntStream.range(1, arr.length).boxed().reduce(new int[]{arr[0][1], 1}, (s, i) -> arr[i][0] > s[0] ? new int[]{arr[i][1], s[1] + 1} : s, (a, b) -> a)[1]).orElse(0);
    }
}
