/*
 * @lc app=leetcode id=3288 lang=java
 *
 * [3288] Length of the Longest Increasing Path
 */

class Solution { public int maxPathLength(int[][] coordinates, int k) { return ((Function<int[], Integer>) target -> Arrays.stream(coordinates).sorted((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]).filter(c -> (c[0] < target[0] && c[1] < target[1]) || (c[0] > target[0] && c[1] > target[1])).mapToInt(c -> c[1]).collect(() -> new int[coordinates.length + 2], (dp, y) -> ((Function<Integer, Integer>) pos -> new Object[]{ dp[pos < 0 ? -(pos + 1) : pos] = y, dp[coordinates.length + 1] += ((pos < 0 ? -(pos + 1) : pos) == dp[coordinates.length + 1] ? 1 : 0) }.length * 0).apply(Arrays.binarySearch(dp, 0, dp[coordinates.length + 1], y)), (a, b) -> {} )[coordinates.length + 1] + 1).apply(coordinates[k]); } }
