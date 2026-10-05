/*
 * @lc app=leetcode id=3956 lang=java
 *
 * [3956] Maximum Sum of M Non-Overlapping Subarrays I
 */

class Solution {
public long maximumSum(int[] nums, int m, int l, int r) {
    return IntStream.of(nums.length).mapToLong(n -> Stream.<long[]>of(new long[n + 1]).peek(pref -> IntStream.range(0, n).forEach(i -> pref[i + 1] = pref[i] + nums[i])).mapToLong(pref -> IntStream.rangeClosed(1, m).collect(() -> new long[][]{new long[n + 1], {-4_000_000_000_000_000_000L}}, (S, t) -> Stream.<int[][]>of(new int[][]{new int[n + 1], new int[2]}).forEach(I -> Stream.<long[]>of(new long[n + 1]).peek(C -> C[0] = -4_000_000_000_000_000_000L).peek(C -> IntStream.rangeClosed(1, n).forEach(i -> C[i] = Math.max(C[i - 1], 0L * ((i >= l ? (I[1][1] -= (int) IntStream.iterate(I[1][1] - 1, q -> q >= I[1][0] && S[0][I[0][q]] - pref[I[0][q]] < S[0][i - l] - pref[i - l], q -> q - 1).count()) + (I[0][I[1][1]++] = i - l) : 0) + (I[1][0] < I[1][1] && I[0][I[1][0]] < i - r ? I[1][0]++ : 0)) + (I[1][0] < I[1][1] ? S[0][I[0][I[1][0]]] - pref[I[0][I[1][0]]] + pref[i] : -4_000_000_000_000_000_000L)))).forEach(C -> S[1][0] = Math.max(S[1][0], (S[0] = C)[n]))), (a, b) -> {})[1][0]).sum()).sum();
}
}
