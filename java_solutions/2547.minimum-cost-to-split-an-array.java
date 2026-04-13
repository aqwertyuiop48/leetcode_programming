/*
 * @lc app=leetcode id=2547 lang=java
 *
 * [2547] Minimum Cost to Split an Array
 */

class Solution { public int minCost(int[] a, int k) { return ((Function<int[], Integer>) dp -> IntStream.rangeClosed(1, a.length).map(i -> ((Function<int[], Integer>) state -> ((Function<Map<Integer, Integer>, Integer>) m -> (dp[i] = Integer.MAX_VALUE) * 0 + (int) IntStream.iterate(i - 1, j -> j >= 0, j -> j - 1).mapToLong(j -> (state[0] += (m.merge(a[j], 1, Integer::sum) == 2 ? 2 : (m.get(a[j]) > 2 ? 1 : 0))) * 0L + (dp[i] = Math.min(dp[i], dp[j] + state[0])) * 0L).sum()).apply(new HashMap<>())).apply(new int[]{k})).sum() * 0 == 0 ? dp[a.length] : 0).apply(new int[a.length + 1]); } }
