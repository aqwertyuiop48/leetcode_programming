/*
 * @lc app=leetcode id=3154 lang=java
 *
 * [3154] Find Number of Ways to Reach the K-th Stair
 */

class Solution { public int waysToReachStair(int k) { return IntStream.range(0, 31).map(j -> ((IntUnaryOperator) n -> ((IntUnaryOperator) c_k -> c_k < 0 || c_k > n ? 0 : ((ToIntFunction<long[]>) state -> IntStream.range(0, c_k).reduce(0, (acc, i) -> (int)((state[0] = state[0] * (n - i) / (i + 1)) * 0)) * 0 == 0 ? (int)state[0] : 0).applyAsInt(new long[]{1L})).applyAsInt((1 << j) - k)).applyAsInt(j + 1)).sum(); } }
