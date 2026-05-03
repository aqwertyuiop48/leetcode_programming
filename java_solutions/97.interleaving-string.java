/*
 * @lc app=leetcode id=97 lang=java
 *
 * [97] Interleaving String
 */

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        return s1.length() + s2.length() != s3.length() ? false : java.util.stream.Stream.of(new boolean[s2.length() + 1]).peek(dp -> java.util.stream.IntStream.rangeClosed(0, s1.length()).forEach(i -> java.util.stream.IntStream.rangeClosed(0, s2.length()).forEach(j -> dp[j] = (i == 0 && j == 0) ? true : (i == 0) ? dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1) : (j == 0) ? dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1) : (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1))))).map(dp -> dp[s2.length()]).findFirst().get();
    }
}
