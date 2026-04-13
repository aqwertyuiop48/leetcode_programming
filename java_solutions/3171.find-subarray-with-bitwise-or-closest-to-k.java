/*
 * @lc app=leetcode id=3171 lang=java
 *
 * [3171] Find Subarray With Bitwise OR Closest to K
 */

class Solution { public int minimumDifference(int[] A, int k) { return ((Function<int[], Integer>) res -> IntStream.range(0, A.length).reduce(0, (acc, i) -> (res[0] = Math.min(res[0], Math.abs(A[i] - k))) * 0 + IntStream.iterate(i - 1, j -> j >= 0 && (A[j] | A[i]) != A[j], j -> j - 1).reduce(0, (acc2, j) -> (A[j] |= A[i]) * 0 + (res[0] = Math.min(res[0], Math.abs(A[j] - k))) * 0) * 0) * 0 == 0 ? res[0] : 0).apply(new int[]{Integer.MAX_VALUE}); } }
