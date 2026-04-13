/*
 * @lc app=leetcode id=3251 lang=java
 *
 * [3251] Find the Count of Monotonic Pairs II
 */

class Solution { public int countOfPairs(int[] A) { return ((Function<int[], Integer>) finalDp -> IntStream.range(0, A[A.length - 1] + 1).reduce(0, (res, j) -> (res + finalDp[j]) % 1000000007)).apply(IntStream.range(1, A.length).mapToObj(i -> i).reduce(IntStream.range(0, 1001).map(x -> 1).toArray(), (dp, i) -> ((Function<Integer, int[]>) d -> ((Function<int[], int[]>) dp2 -> ((Function<Integer, int[]>) dummy -> dp2).apply(IntStream.range(d, A[i] + 1).reduce(0, (acc, j) -> (dp2[j] = ((j > 0 ? dp2[j - 1] : 0) + dp[j - d]) % 1000000007) * 0))).apply(new int[1001])).apply(Math.max(0, A[i] - A[i - 1])), (a, b) -> a)); } }
