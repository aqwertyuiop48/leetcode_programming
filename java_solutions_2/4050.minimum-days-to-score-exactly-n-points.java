/*
 * @lc app=leetcode id=4050 lang=java
 *
 * [4050] Minimum Days to Score Exactly N Points
 */

class Solution {
public int minDays(int n) {
    return Stream.of(IntStream.range(0, n + 1).map(i -> i == 0 ? 0 : 1_000_000_000).toArray())
        .peek(dp -> IntStream.iterate(1, k -> k + 1)
            .takeWhile(k -> k * (k + 1) / 2 <= n)
            .forEach(k -> IntStream.rangeClosed(k * (k + 1) / 2, Math.min(n, k * (k + 1)))
                .forEach(i -> dp[i] = i == k * (k + 1) / 2
                    ? k
                    : Math.min(dp[i], dp[i - k * (k + 1) / 2] + k + 1))))
        .mapToInt(dp -> dp[n])
        .findFirst().getAsInt();
}
}
