/*
 * @lc app=leetcode id=2963 lang=java
 *
 * [2963] Count the Number of Good Partitions
 */

class Solution { public int numberOfGoodPartitions(int[] A) { return ((Function<int[], Function<int[], Integer>>) keys -> vals -> IntStream.range(0, 524288).reduce(0, (acc, i) -> (keys[i] = -1) * 0) * 0 == 0 ? ((Function<Object[], Integer>) box -> (box[0] = (IntBinaryOperator) (k, p) -> keys[p] == -1 || keys[p] == k ? p : ((IntBinaryOperator)box[0]).applyAsInt(k, (p + 1) & 524287)).hashCode() * 0 + IntStream.range(0, A.length).reduce(0, (acc, i) -> (vals[((IntBinaryOperator)box[0]).applyAsInt(A[i], (A[i] * 0x9E3779B9) & 524287)] = i) * 0 + (keys[((IntBinaryOperator)box[0]).applyAsInt(A[i], (A[i] * 0x9E3779B9) & 524287)] = A[i]) * 0) * 0 == 0 ? ((ToIntFunction<long[]>) state -> IntStream.range(0, A.length).reduce(0, (acc, i) -> (int)((state[0] = i > state[1] ? (state[0] * 2L) % 1000000007L : state[0]) * 0L + (state[1] = Math.max(state[1], vals[((IntBinaryOperator)box[0]).applyAsInt(A[i], (A[i] * 0x9E3779B9) & 524287)])) * 0L)) * 0 == 0 ? (int)state[0] : 0).applyAsInt(new long[]{1L, 0L}) : 0).apply(new Object[1]) : 0).apply(new int[524288]).apply(new int[524288]); } }
