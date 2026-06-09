/*
 * @lc app=leetcode id=474 lang=java
 *
 * [474] Ones and Zeroes
 */

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        return java.util.stream.Stream.of(new int[m + 1][n + 1]).peek(dp -> java.util.Arrays.stream(strs).map(s -> new int[]{(int) s.chars().filter(c -> c == '0').count(), (int) s.chars().filter(c -> c == '1').count()}).forEach(counts -> java.util.stream.IntStream.iterate(m, i -> i >= counts[0], i -> i - 1).forEach(i -> java.util.stream.IntStream.iterate(n, j -> j >= counts[1], j -> j - 1).forEach(j -> dp[i][j] = Math.max(dp[i][j], dp[i - counts[0]][j - counts[1]] + 1))))).map(dp -> dp[m][n]).findFirst().get();
    }
}
