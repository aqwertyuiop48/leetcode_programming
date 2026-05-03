/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

class Solution {
    public int numDecodings(String s) {
        return s.startsWith("0") ? 0 : java.util.stream.IntStream.range(1, s.length()).boxed().reduce(new int[]{1, 1}, (dp, i) -> new int[]{dp[1], (s.charAt(i) != '0' ? dp[1] : 0) + (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6') ? dp[0] : 0)}, (a, b) -> a)[1];
    }
}
