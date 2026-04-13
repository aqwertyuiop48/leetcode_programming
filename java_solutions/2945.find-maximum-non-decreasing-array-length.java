/*
 * @lc app=leetcode id=2945 lang=java
 *
 * [2945] Find Maximum Non-decreasing Array Length
 */

class Solution { public int findMaximumLength(int[] A) { return ((Function<long[], Integer>) acc -> ((Function<int[], Integer>) pre -> ((Function<int[], Integer>) dp -> ((Function<int[], Integer>) state -> (IntStream.rangeClosed(1, A.length).mapToLong(idx -> acc[idx] = acc[idx - 1] + A[idx - 1]).sum() * 0L == 0L) ? IntStream.rangeClosed(1, A.length).map(j -> (state[0] = Math.max(state[0], pre[j])) * 0 + (dp[j] = dp[state[0]] + 1) * 0 + (state[1] = Arrays.binarySearch(acc, 2 * acc[j] - acc[state[0]])) * 0 + (state[1] = state[1] < 0 ? -state[1] - 1 : state[1]) * 0 + (state[1] < pre.length ? (pre[state[1]] = Math.max(pre[state[1]], j)) : 0) * 0).sum() * 0 == 0 ? dp[A.length] : 0 : 0).apply(new int[2])).apply(new int[A.length + 1])).apply(new int[A.length + 2])).apply(new long[A.length + 1]); } }
