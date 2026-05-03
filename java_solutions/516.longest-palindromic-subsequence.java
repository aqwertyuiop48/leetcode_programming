/*
 * @lc app=leetcode id=516 lang=java
 *
 * [516] Longest Palindromic Subsequence
 */

record Solution() {
    public int longestPalindromeSubseq(String s) {
        return s.chars().boxed().reduce(new int[s.length() + 1], (dp, c) -> java.util.stream.IntStream.rangeClosed(1, s.length()).reduce(new int[s.length() + 1], (next, j) -> java.util.stream.Stream.of(next).peek(arr -> arr[j] = c == s.charAt(s.length() - j) ? dp[j - 1] + 1 : Math.max(dp[j], arr[j - 1])).findFirst().get(), (a, b) -> a), (a, b) -> a)[s.length()];
    }
}
