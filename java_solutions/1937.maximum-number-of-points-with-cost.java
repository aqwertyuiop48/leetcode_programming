/*
 * @lc app=leetcode id=1937 lang=java
 *
 * [1937] Maximum Number of Points with Cost
 */

class Solution {
    public long maxPoints(int[][] points) {
        return java.util.Arrays.stream(points).reduce(new long[points[0].length], (dp, row) -> java.util.Optional.of(java.util.stream.IntStream.range(0, dp.length).boxed().reduce(new long[dp.length], (arr, j) -> (arr[j] = j == 0 ? dp[j] : Math.max(arr[j-1] - 1, dp[j])) == arr[j] ? arr : arr, (x, y) -> x)).map(left -> java.util.Optional.of(java.util.stream.IntStream.iterate(dp.length - 1, j -> j - 1).limit(dp.length).boxed().reduce(new long[dp.length], (arr, j) -> (arr[j] = j == dp.length - 1 ? dp[j] : Math.max(arr[j+1] - 1, dp[j])) == arr[j] ? arr : arr, (x, y) -> x)).map(right -> java.util.stream.IntStream.range(0, dp.length).mapToLong(i -> row[i] + Math.max(left[i], right[i])).toArray()).get()).get(), (a, b) -> a).stream().max().getAsLong();
    }
}
