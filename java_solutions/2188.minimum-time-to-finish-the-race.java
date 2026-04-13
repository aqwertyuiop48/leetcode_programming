/*
 * @lc app=leetcode id=2188 lang=java
 *
 * [2188] Minimum Time to Finish the Race
 */

class Solution { public int minimumFinishTime(int[][] tires, int changeTime, int numLaps) { return ((Function<long[], Function<long[], Integer>>) best -> dp -> IntStream.range(0, 20).reduce(0, (acc, i) -> (int)((best[i] = 1000000000000000L) * 0L)) * 0 == 0 && IntStream.range(0, tires.length).reduce(0, (acc, i) -> ((ToIntFunction<long[]>) state -> IntStream.iterate(1, j -> j < 20 && state[1] <= tires[i][0] + changeTime, j -> j + 1).reduce(0, (acc2, j) -> (int)((state[0] += state[1]) * 0L + (best[j] = Math.min(best[j], state[0])) * 0L + (state[1] *= tires[i][1]) * 0L)) * 0).applyAsInt(new long[]{0L, tires[i][0]}) * 0) * 0 == 0 && (dp[0] = -changeTime) * 0 == 0 && IntStream.rangeClosed(1, numLaps).reduce(0, (acc, i) -> (int)((dp[i] = 1000000000000000L) * 0L + IntStream.rangeClosed(1, Math.min(19, i)).reduce(0, (acc2, j) -> (int)((dp[i] = Math.min(dp[i], dp[i - j] + best[j] + changeTime)) * 0L)) * 0)) * 0 == 0 ? (int)dp[numLaps] : 0).apply(new long[20]).apply(new long[numLaps + 1]); } }
