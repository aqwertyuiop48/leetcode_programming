/*
 * @lc app=leetcode id=3017 lang=java
 *
 * [3017] Count the Number of Houses at a Certain Distance II
 */

class Solution { public long[] countOfPairs(int n, int x, int y) { return ((Function<int[], long[]>) c -> ((Function<long[], long[]>) A -> IntStream.rangeClosed(1, n).map(i -> (int)( (A[0] += 2) * 0 + (A[Math.min(i - 1, Math.abs(i - c[1]) + c[0])]--) * 0 + (A[Math.min(n - i, Math.abs(i - c[0]) + 1 + n - c[1])]--) * 0 + (A[Math.min(Math.abs(i - c[0]), Math.abs(c[1] - i) + 1)]++) * 0 + (A[Math.min(Math.abs(i - c[0]) + 1, Math.abs(c[1] - i))]++) * 0 + (A[Math.max(c[0] - i, 0) + Math.max(i - c[1], 0) + (c[1] - c[0]) / 2]--) * 0 + (A[Math.max(c[0] - i, 0) + Math.max(i - c[1], 0) + (c[1] - c[0] + 1) / 2]--) * 0 )).sum() * 0 == 0 ? IntStream.range(1, n).map(i -> (int)(A[i] += A[i - 1])).sum() * 0 == 0 ? A : A : A).apply(new long[n])).apply(new int[]{Math.min(x, y), Math.max(x, y)}); } }
