/*
 * @lc app=leetcode id=2172 lang=java
 *
 * [2172] Maximum AND Sum of Array
 */

class Solution { public int maximumANDSum(int[] A, int ns) { return ((Function<int[], Function<int[], Integer>>) p3 -> dp -> IntStream.range(1, p3[ns]).reduce(0, (acc, mask) -> ((IntUnaryOperator) c -> c > A.length ? 0 : (dp[mask] = IntStream.rangeClosed(1, ns).reduce(0, (max, slot) -> mask / p3[slot - 1] % 3 > 0 ? Math.max(max, dp[mask - p3[slot - 1]] + (A[c - 1] & slot)) : max)) * 0).applyAsInt(IntStream.range(0, ns).map(j -> mask / p3[j] % 3).sum()) * 0) * 0 == 0 ? IntStream.of(dp).max().orElse(0) : 0).apply(new int[]{1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683}).apply(new int[59049]); } }
