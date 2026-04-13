/*
 * @lc app=leetcode id=3027 lang=java
 *
 * [3027] Find the Number of Ways to Place People II
 */

class Solution { public int numberOfPairs(int[][] P) { return ((Function<long[], Integer>) sorted -> IntStream.range(0, sorted.length).map(i -> ((IntUnaryOperator) yi -> ((ToIntFunction<long[]>) state -> IntStream.range(i + 1, sorted.length).reduce(0, (acc, j) -> ((IntUnaryOperator) yj -> yj >= yi && state[1] > yj ? (int)((state[0]++) * 0L + (state[1] = yj) * 0L) : 0).applyAsInt((int)(sorted[j] & 0xFFFFFFFFL))) * 0 == 0 ? (int)state[0] : 0).applyAsInt(new long[]{0, Long.MAX_VALUE})).applyAsInt((int)(sorted[i] & 0xFFFFFFFFL))).sum()).apply(IntStream.range(0, P.length).mapToLong(i -> (((long)(1000000000 - P[i][0])) << 32) | ((long)P[i][1] + 1000000000L)).sorted().toArray()); } }
