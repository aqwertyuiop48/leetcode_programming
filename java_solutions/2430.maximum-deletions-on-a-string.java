/*
 * @lc app=leetcode id=2430 lang=java
 *
 * [2430] Maximum Deletions on a String
 */

class Solution { public int deleteString(String s) { return ((Function<int[][], Function<int[], Integer>>) lcs -> dp -> IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).map(i -> (dp[i] = 1) * 0 + IntStream.range(i + 1, s.length()).map(j -> (s.charAt(i) == s.charAt(j) ? (lcs[i][j] = lcs[i + 1][j + 1] + 1) : 0) * 0 + (lcs[i][j] >= j - i ? (dp[i] = Math.max(dp[i], dp[j] + 1)) : 0) * 0).sum() * 0).sum() * 0 == 0 ? dp[0] : 0).apply(new int[s.length() + 1][s.length() + 1]).apply(new int[s.length()]); } }
