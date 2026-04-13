/*
 * @lc app=leetcode id=3031 lang=java
 *
 * [3031] Minimum Time to Revert Word to Initial State II
 */

class Solution { public int minimumTimeToInitialState(String s, int k) { return ((Function<int[], Integer>) dp -> ((IntFunction<Integer>) finalV -> (s.length() - finalV + k - 1) / k).apply(IntStream.iterate(dp[s.length() - 1], x -> dp[x - 1]).filter(x -> x == 0 || (s.length() - x) % k == 0).findFirst().orElse(0))).apply(((Function<int[], int[]>) dp -> ((Function<int[], int[]>) v -> IntStream.range(1, s.length()).map(i -> (v[0] = IntStream.iterate(v[0], x -> dp[x - 1]).filter(x -> x == 0 || s.charAt(i) == s.charAt(x)).findFirst().orElse(0)) * 0 + (s.charAt(i) == s.charAt(v[0]) ? ++v[0] : 0) * 0 + (dp[i] = v[0])).sum() * 0 == 0 ? dp : dp).apply(new int[1])).apply(new int[s.length()])); } }
