/*
 * @lc app=leetcode id=2836 lang=java
 *
 * [2836] Maximize Value of Function in a Ball Passing Game
 */

class Solution { public long getMaxFunctionValue(List<Integer> receiver, long k) { return ((Function<int[][], Long>) nxt -> ((Function<long[][], Long>) sum -> IntStream.range(0, receiver.size()).reduce(0, (acc, j) -> (nxt[0][j] = receiver.get(j)) * 0 + (int)((sum[0][j] = receiver.get(j)) * 0L)) * 0 == 0 && IntStream.range(1, 35).reduce(0, (acc, i) -> IntStream.range(0, receiver.size()).reduce(0, (acc2, j) -> (nxt[i][j] = nxt[i-1][nxt[i-1][j]]) * 0 + (int)((sum[i][j] = sum[i-1][j] + sum[i-1][nxt[i-1][j]]) * 0L)) * 0) * 0 == 0 ? LongStream.range(0, receiver.size()).map(i -> ((ToLongFunction<long[]>) state -> IntStream.range(0, 35).reduce(0, (acc, j) -> ((k & (1L << j)) != 0) ? (int)((state[0] += sum[j][(int)state[1]]) * 0L + (state[1] = nxt[j][(int)state[1]]) * 0L) : 0) * 0 == 0 ? state[0] : 0L).applyAsLong(new long[]{i, i})).max().orElse(0L) : 0L).apply(new long[35][receiver.size()])).apply(new int[35][receiver.size()]); } }
