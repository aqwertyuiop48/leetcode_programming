/*
 * @lc app=leetcode id=1879 lang=java
 *
 * [1879] Minimum XOR Sum of Two Arrays
 */

class Solution { public int minimumXORSum(int[] nums1, int[] nums2) { return ((Function<int[], Integer>) dp -> IntStream.range(1, dp.length).reduce(0, (acc, i) -> (dp[i] = 1000000000) * 0) * 0 == 0 && IntStream.range(0, dp.length).reduce(0, (acc, mask) -> ((IntUnaryOperator) i -> IntStream.range(0, nums2.length).reduce(0, (acc2, j) -> (mask & (1 << j)) == 0 ? (dp[mask | (1 << j)] = Math.min(dp[mask | (1 << j)], dp[mask] + (nums1[i] ^ nums2[j]))) * 0 : 0) * 0).applyAsInt(Integer.bitCount(mask)) * 0) * 0 == 0 ? dp[dp.length - 1] : 0).apply(new int[1 << nums2.length]); } }
