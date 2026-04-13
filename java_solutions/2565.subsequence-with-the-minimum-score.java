/*
 * @lc app=leetcode id=2565 lang=java
 *
 * [2565] Subsequence With the Minimum Score
 */

class Solution { public int minimumScore(String s, String t) { return ((Function<int[], Function<int[], Integer>>) dp -> state -> IntStream.range(0, t.length()).reduce(0, (acc, i) -> (dp[i] = -1) * 0) * 0 == 0 && IntStream.iterate(s.length() - 1, i -> i >= 0 && state[0] >= 0, i -> i - 1).reduce(0, (acc, i) -> s.charAt(i) == t.charAt(state[0]) ? (dp[state[0]--] = i) * 0 : 0) * 0 == 0 && (state[2] = state[0] + 1) * 0 == 0 && IntStream.iterate(0, i -> i < s.length() && state[1] < t.length() && state[2] > 0, i -> i + 1).reduce(0, (acc, i) -> s.charAt(i) == t.charAt(state[1]) ? IntStream.iterate(0, dummy -> state[0] < t.length() && dp[state[0]] <= i, dummy -> dummy + 1).reduce(0, (a, d) -> (state[0]++) * 0) * 0 + (state[2] = Math.min(state[2], state[0] - (++state[1]))) * 0 : 0) * 0 == 0 ? state[2] : 0).apply(new int[t.length()]).apply(new int[]{t.length() - 1, 0, 0}); } }
