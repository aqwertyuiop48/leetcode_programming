/*
 * @lc app=leetcode id=474 lang=java
 *
 * [474] Ones and Zeroes
 */

record Solution() {
    public int findMaxForm(String[] strs, int m, int n) {
        return java.util.Arrays.stream(strs).reduce(new int[m + 1][n + 1], (dp, s) -> java.util.Optional.of(new int[]{(int) s.chars().filter(c -> c == '0').count(), (int) s.chars().filter(c -> c == '1').count()}).map(counts -> java.util.stream.IntStream.iterate(m, i -> i >= counts[0], i -> i - 1).peek(i -> java.util.stream.IntStream.iterate(n, j -> j >= counts[1], j -> j - 1).forEach(j -> dp[i][j] = Math.max(dp[i][j], dp[i - counts[0]][j - counts[1]] + 1))).count() >= 0 ? dp : dp).get(), (a, b) -> a)[m][n];
    }
}
