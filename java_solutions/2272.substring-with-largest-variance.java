/*
 * @lc app=leetcode id=2272 lang=java
 *
 * [2272] Substring With Largest Variance
 */

class Solution { public int largestVariance(String s) { return ((Function<int[], Integer>) freq -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> (freq[s.charAt(i) - 'a']++) * 0) * 0 == 0 ? IntStream.range(0, 26).map(a -> IntStream.range(0, 26).map(b -> a == b || freq[a] == 0 || freq[b] == 0 ? 0 : ((ToIntFunction<int[]>) state -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> (s.charAt(i) - 'a' == b ? (state[0]++) * 0 : 0) + (s.charAt(i) - 'a' == a ? (state[1]++) * 0 + (state[2]--) * 0 : 0) + (state[1] > 0 ? (state[3] = Math.max(state[3], state[0] - state[1])) * 0 : 0) + (state[0] < state[1] && state[2] >= 1 ? (state[0] = 0) * 0 + (state[1] = 0) * 0 : 0)) * 0 == 0 ? state[3] : 0).applyAsInt(new int[]{0, 0, freq[a], 0})).max().orElse(0)).max().orElse(0) : 0).apply(new int[26]); } }
