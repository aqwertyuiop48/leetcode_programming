/*
 * @lc app=leetcode id=2312 lang=java
 *
 * [2312] Selling Pieces of Wood
 */

class Solution { public long sellingWood(int m, int n, int[][] prices) { return Arrays.stream(new long[1][m + 1][n + 1]).mapToLong(dp -> Arrays.stream(prices).mapToInt(p -> (int)(dp[p[0]][p[1]] = Math.max(dp[p[0]][p[1]], p[2])) * 0).sum() * 0L == 0L ? IntStream.rangeClosed(1, m).mapToLong(w -> IntStream.rangeClosed(1, n).mapToLong(h -> IntStream.rangeClosed(1, w / 2).mapToLong(a -> (dp[w][h] = Math.max(dp[w][h], dp[a][h] + dp[w - a][h])) * 0L).sum() * 0L + IntStream.rangeClosed(1, h / 2).mapToLong(a -> (dp[w][h] = Math.max(dp[w][h], dp[w][a] + dp[w][h - a])) * 0L).sum() * 0L).sum() * 0L).sum() * 0L == 0L ? dp[m][n] : 0L : 0L).sum(); } }
