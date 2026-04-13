/*
 * @lc app=leetcode id=2141 lang=java
 *
 * [2141] Maximum Running Time of N Computers
 */

class Solution { public long maxRunTime(int n, int[] A) { return ((ToLongFunction<long[]>) bs -> LongStream.iterate(0, d -> bs[0] <= bs[1], d -> d + 1).reduce(0L, (acc, d) -> ((LongUnaryOperator) mid -> IntStream.of(A).mapToLong(a -> Math.min((long)a, mid)).sum() >= (long)n * mid ? (bs[2] = mid) * 0L + (bs[0] = mid + 1) * 0L : (bs[1] = mid - 1) * 0L).applyAsLong((bs[0] + bs[1]) / 2) * 0L) == 0L ? bs[2] : 0L).applyAsLong(new long[]{1L, IntStream.of(A).mapToLong(i -> (long)i).sum() / n, 0L}); } }
