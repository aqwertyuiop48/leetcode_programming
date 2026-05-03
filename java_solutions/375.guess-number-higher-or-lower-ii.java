/*
 * @lc app=leetcode id=375 lang=java
 *
 * [375] Guess Number Higher or Lower II
 */

record Solution() {
    public int getMoneyAmount(int n) {
        return java.util.stream.IntStream.rangeClosed(2, n).boxed().reduce(new int[n + 2][n + 2], (dp, len) -> java.util.stream.IntStream.rangeClosed(1, n - len + 1).peek(i -> dp[i][i + len - 1] = java.util.stream.IntStream.range(i, i + len - 1).map(k -> k + Math.max(dp[i][k - 1], dp[k + 1][i + len - 1])).min().orElse(0)).count() >= 0 ? dp : dp, (a, b) -> a)[1][n];
    }
}
