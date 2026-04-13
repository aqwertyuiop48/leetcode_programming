/*
 * @lc app=leetcode id=2897 lang=java
 *
 * [2897] Apply Operations on Array to Maximize Sum of Squares
 */

class Solution { public int maxSum(List<Integer> A, int k) { return ((Function<int[], Integer>) count -> IntStream.range(0, A.size()).reduce(0, (acc, i) -> IntStream.range(0, 31).reduce(0, (acc2, b) -> (count[b] += (A.get(i) & (1 << b)) != 0 ? 1 : 0) * 0) * 0) * 0 == 0 ? ((Function<long[], Integer>) res -> IntStream.range(0, k).reduce(0, (acc, j) -> ((ToIntFunction<long[]>) cur -> IntStream.range(0, 31).reduce(0, (acc2, b) -> count[b] > 0 ? (int)((count[b]--) * 0L + (cur[0] += 1L << b) * 0L) : 0) * 0 == 0 ? (int)((res[0] = (res[0] + (cur[0] * cur[0]) % 1000000007L) % 1000000007L) * 0L) : 0).applyAsInt(new long[1])) * 0 == 0 ? (int)res[0] : 0).apply(new long[1]) : 0).apply(new int[31]); } }
