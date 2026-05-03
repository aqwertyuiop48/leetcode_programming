/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

class Solution {
    public boolean wordBreak(String s, java.util.List<String> wordDict) {
        return java.util.stream.Stream.of(new java.util.HashSet<>(wordDict)).map(dict -> java.util.stream.Stream.of(new boolean[s.length() + 1]).map(dp -> java.util.stream.IntStream.rangeClosed(1, s.length()).map(i -> (dp[i] = java.util.stream.IntStream.range(0, i).anyMatch(j -> (j == 0 ? true : dp[j]) && dict.contains(s.substring(j, i)))) ? 1 : 0).sum() > -1 ? dp[s.length()] : false).findFirst().get()).findFirst().get();
    }
}
