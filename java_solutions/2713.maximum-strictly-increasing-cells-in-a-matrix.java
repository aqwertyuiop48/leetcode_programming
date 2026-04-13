/*
 * @lc app=leetcode id=2713 lang=java
 *
 * [2713] Maximum Strictly Increasing Cells in a Matrix
 */

class Solution { public int maxIncreasingCells(int[][] M) { return ((Function<long[], Integer>) sorted -> ((Function<int[], Integer>) batchDp -> ((Function<int[], Integer>) start -> ((ToIntFunction<int[]>) state -> IntStream.range(0, M.length * M[0].length).reduce(0, (acc, idx) -> (int)((batchDp[idx] = Math.max(state[(int)((sorted[idx] >>> 18) & 0x3FFFF)], state[M.length + (int)(sorted[idx] & 0x3FFFF)]) + 1) * 0L + (idx == M.length * M[0].length - 1 || (sorted[idx] >>> 36) != (sorted[idx + 1] >>> 36) ? IntStream.rangeClosed(start[0], idx).reduce(0, (acc2, k) -> (state[(int)((sorted[k] >>> 18) & 0x3FFFF)] = Math.max(state[(int)((sorted[k] >>> 18) & 0x3FFFF)], batchDp[k])) * 0 + (state[M.length + (int)(sorted[k] & 0x3FFFF)] = Math.max(state[M.length + (int)(sorted[k] & 0x3FFFF)], batchDp[k])) * 0) * 0 + (start[0] = idx + 1) * 0 : 0))) * 0 == 0 ? IntStream.of(state).max().orElse(0) : 0).applyAsInt(new int[M.length + M[0].length])).apply(new int[]{0})).apply(new int[M.length * M[0].length])).apply(LongStream.range(0, (long)M.length * M[0].length).map(idx -> (((long)M[(int)(idx / M[0].length)][(int)(idx % M[0].length)] + 100000L) << 36) | (((idx / M[0].length)) << 18) | (idx % M[0].length)).sorted().toArray()); } }
