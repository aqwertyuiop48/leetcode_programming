/*
 * @lc app=leetcode id=2209 lang=java
 *
 * [2209] Minimum White Tiles After Covering With Carpets
 */

class Solution { public int minimumWhiteTiles(String s, int nc, int l) { return ((Function<int[][], Integer>) dp -> IntStream.rangeClosed(1, s.length()).reduce(0, (a, i) -> IntStream.rangeClosed(0, nc).reduce(0, (a2, k) -> (dp[i][k] = Math.min(dp[i - 1][k] + s.charAt(i - 1) - '0', k > 0 ? dp[Math.max(i - l, 0)][k - 1] : 1000000)) * 0) * 0) * 0 == 0 ? dp[s.length()][nc] : 0).apply(new int[s.length() + 1][nc + 1]); } }
