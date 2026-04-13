/*
 * @lc app=leetcode id=2262 lang=java
 *
 * [2262] Total Appeal of A String
 */

class Solution { public long appealSum(String s) { return ((Function<long[], ToLongFunction<long[]>>) prev -> state -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> (int)((state[1] += i + 1 - prev[s.charAt(i) - 'a']) * 0L + (prev[s.charAt(i) - 'a'] = i + 1) * 0L + (state[0] += state[1]) * 0L)) * 0 == 0 ? state[0] : 0).apply(new long[26]).applyAsLong(new long[2]); } }
