/*
 * @lc app=leetcode id=3261 lang=java
 *
 * [3261] Count Substrings That Satisfy K-Constraint II
 */

class Solution { public long[] countKConstraintSubstrings(String s, int k, int[][] queries) { return ((Function<int[], long[]>) data -> ((Function<int[], long[]>) th -> ((Function<long[], long[]>) presum -> ((Function<long[], long[]>) st -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> IntStream.iterate(0, d -> st[2] < s.length() && (st[data[(int)st[2]]] + 1 <= k || st[1 - data[(int)st[2]]] <= k), d -> d + 1).reduce(0, (a, d) -> (int)( (st[data[(int)st[2]]]++) * 0L + (th[(int)st[2]] = i) * 0L + (st[2]++) * 0L )) * 0 + (int)( (st[3] += (st[2] - i)) * 0L + (presum[i] = st[3]) * 0L + (st[data[i]]--) * 0L )) * 0 == 0 ? IntStream.range(0, queries.length).mapToLong(qi -> ((IntToLongFunction) TH -> (queries[qi][0] < TH ? presum[TH - 1] - (queries[qi][0] == 0 ? 0L : presum[queries[qi][0] - 1]) : 0L) + (long)(queries[qi][1] - TH + 2) * (queries[qi][1] - TH + 1) / 2).applyAsLong(Math.max(queries[qi][0], th[queries[qi][1]]))).toArray() : null).apply(new long[4])).apply(new long[s.length()])).apply(new int[s.length()])).apply(s.chars().map(c -> c - '0').toArray()); } }
