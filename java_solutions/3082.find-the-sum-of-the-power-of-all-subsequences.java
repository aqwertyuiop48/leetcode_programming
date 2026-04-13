/*
 * @lc app=leetcode id=3082 lang=java
 *
 * [3082] Find the Sum of the Power of All Subsequences
 */

class Solution { public int sumOfPower(int[] A, int k) { return ((IntUnaryOperator) n -> ((Function<int[][], Integer>) dp -> (dp[0][0] = 1) * 0 == 0 && IntStream.of(A).reduce(0, (acc, a) -> IntStream.rangeClosed(a, k).map(v -> k - v + a).reduce(0, (acc2, v) -> IntStream.rangeClosed(1, n).map(i -> n - i + 1).reduce(0, (acc3, i) -> (dp[i][v] = (dp[i][v] + dp[i - 1][v - a]) % 1000000007) * 0) * 0) * 0) * 0 == 0 ? ((ToIntFunction<long[]>) state -> IntStream.rangeClosed(1, n).map(i -> n - i + 1).reduce(0, (acc, i) -> (int)((state[0] = (state[0] + (state[1] * dp[i][k]) % 1000000007) % 1000000007) * 0L + (state[1] = (state[1] * 2) % 1000000007) * 0L)) * 0 == 0 ? (int)state[0] : 0).applyAsInt(new long[]{0, 1}) : 0).apply(new int[n + 1][k + 1])).applyAsInt(A.length); } }
