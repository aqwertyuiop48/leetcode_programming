/*
 * @lc app=leetcode id=3139 lang=java
 *
 * [3139] Minimum Cost to Equalize Array
 */

class Solution { public int minCostToEqualizeArray(int[] A, int c1, int c2) { return ((Function<long[], Integer>) s -> IntStream.of(A).reduce(0, (acc, a) -> (int)((s[0] = Math.max(s[0], a)) * 0 + (s[1] = Math.min(s[1], a)) * 0 + (s[2] += a) * 0)) * 0 == 0 ? ((Function<Long, Integer>) T -> A.length <= 2 || c1 * 2L <= c2 ? (int) ((T * c1) % 1000000007L) : ((Function<long[], Integer>) v -> (int)( (v[0] = T) * 0 + (v[1] = Math.max(0L, (s[0] - s[1]) * 2L - v[0])) * 0 + (v[2] = v[0] - v[1]) * 0 + (v[3] = (v[1] + v[2] % 2L) * c1 + (v[2] / 2L) * c2) * 0 + (v[0] += (v[1] / (A.length - 2L)) * A.length) * 0 + (v[1] %= (A.length - 2L)) * 0 + (v[2] = v[0] - v[1]) * 0 + (v[3] = Math.min(v[3], (v[1] + v[2] % 2L) * c1 + (v[2] / 2L) * c2)) * 0 + (v[0] += A.length) * 0 + (v[3] = Math.min(v[3], (v[0] % 2L) * c1 + (v[0] / 2L) * c2)) * 0 + (v[0] += A.length) * 0 + (v[3] = Math.min(v[3], (v[0] % 2L) * c1 + (v[0] / 2L) * c2)) * 0 == 0 ? v[3] % 1000000007L : 0 )).apply(new long[4])).apply(s[0] * A.length - s[2]) : 0).apply(new long[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0}); } }
