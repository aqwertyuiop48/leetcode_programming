/*
 * @lc app=leetcode id=743 lang=java
 *
 * [743] Network Delay Time
 */

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        return new int[n + 1] instanceof int[] d && java.util.stream.IntStream.range(0, n + 1).peek(i -> d[i] = i == k ? 0 : Integer.MAX_VALUE / 2).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, n).peek(r -> java.util.Arrays.stream(times).forEach(e -> d[e[1]] = Math.min(d[e[1]], d[e[0]] + e[2]))).allMatch(x -> true)
            ? java.util.stream.IntStream.of(java.util.stream.IntStream.rangeClosed(1, n).map(i -> d[i]).max().getAsInt()).map(m -> m >= Integer.MAX_VALUE / 2 ? -1 : m).findFirst().getAsInt() : 0;
    }
}
