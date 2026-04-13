/*
 * @lc app=leetcode id=3250 lang=java
 *
 * [3250] Find the Count of Monotonic Pairs I
 */

class Solution { public int countOfPairs(int[] A) { return ((Function<int[], Integer>) finalDp -> IntStream.rangeClosed(0, A[A.length - 1]).reduce(0, (res, j) -> (res + finalDp[j]) % 1000000007)).apply(IntStream.range(1, A.length).boxed().reduce(IntStream.range(0, 1001).map(x -> 1).toArray(), (dp, i) -> ((Function<Integer, int[]>) d -> ((Function<int[], int[]>) acc -> IntStream.range(0, 1001).map(j -> j < d || j > A[i] ? 0 : (acc[0] = (acc[0] + dp[j - d]) % 1000000007)).toArray()).apply(new int[1])).apply(Math.max(0, A[i] - A[i - 1])), (a, b) -> a)); } }
