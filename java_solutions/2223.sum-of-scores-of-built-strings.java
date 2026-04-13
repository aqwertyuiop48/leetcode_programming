/*
 * @lc app=leetcode id=2223 lang=java
 *
 * [2223] Sum of Scores of Built Strings
 */

class Solution { public long sumScores(String s) { return ((Function<int[], Long>) lps -> ((ToLongFunction<int[]>) state -> IntStream.iterate(1, i -> i < s.length(), i -> i + 1).reduce(0, (a, i) -> IntStream.iterate(0, x -> state[0] > 0 && s.charAt(i) != s.charAt(state[0]), x -> x + 1).reduce(0, (a2, x) -> (state[0] = lps[state[0] - 1]) * 0) * 0 + (s.charAt(i) == s.charAt(state[0]) ? state[0]++ : 0) * 0 + (lps[i] = state[0]) * 0) * 0 == 0 ? ((Function<int[], Long>) dp -> ((ToLongFunction<long[]>) res -> IntStream.range(1, s.length()).reduce(0, (a, i) -> (int)((dp[i] = lps[i] == 0 ? 0 : dp[lps[i] - 1] + 1) * 0L + (res[0] += dp[i]) * 0L)) * 0 == 0 ? res[0] : 0L).applyAsLong(new long[]{s.length()})).apply(new int[s.length()]) : 0L).applyAsLong(new int[1])).apply(new int[s.length()]); } }
