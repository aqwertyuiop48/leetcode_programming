/*
 * @lc app=leetcode id=2354 lang=java
 *
 * [2354] Number of Excellent Pairs
 */

class Solution { public long countExcellentPairs(int[] A, int k) { return ((Function<long[], Long>) cnt -> Arrays.stream(A).distinct().mapToLong(a -> (cnt[Integer.bitCount(a)]++) * 0L).sum() * 0L == 0L ? IntStream.range(0, 31).mapToLong(i -> IntStream.range(0, 31).filter(j -> i + j >= k).mapToLong(j -> cnt[i] * cnt[j]).sum()).sum() : 0L).apply(new long[31]); } }
