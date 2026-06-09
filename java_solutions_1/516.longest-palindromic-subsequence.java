/*
 * @lc app=leetcode id=516 lang=java
 *
 * [516] Longest Palindromic Subsequence
 */

class Solution {
    public int longestPalindromeSubseq(String s) {
        return java.util.stream.Stream.of(0).map(_v -> new int[s.length()][s.length()]).peek(dp -> java.util.stream.IntStream.range(0, s.length()).forEach(i -> dp[i][i] = 1)).peek(dp -> java.util.stream.IntStream.rangeClosed(2, s.length()).forEach(len -> java.util.stream.IntStream.rangeClosed(0, s.length() - len).forEach(i -> dp[i][i + len - 1] = s.charAt(i) == s.charAt(i + len - 1) ? dp[i + 1][i + len - 2] + 2 : Math.max(dp[i + 1][i + len - 1], dp[i][i + len - 2])))).map(dp -> dp[0][s.length() - 1]).findFirst().get();
    }
}
