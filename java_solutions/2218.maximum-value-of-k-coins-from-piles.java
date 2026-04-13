/*
 * @lc app=leetcode id=2218 lang=java
 *
 * [2218] Maximum Value of K Coins From Piles
 */

class Solution { public int maxValueOfCoins(List<List<Integer>> piles, int k) { return ((Function<int[], Integer>) dp -> IntStream.range(0, piles.size()).reduce(0, (a, i) -> IntStream.iterate(k, j -> j >= 0, j -> j - 1).reduce(0, (a2, j) -> ((ToIntFunction<int[]>) cur -> IntStream.rangeClosed(1, Math.min(piles.get(i).size(), j)).reduce(0, (a3, x) -> (cur[0] += piles.get(i).get(x - 1)) * 0 + (dp[j] = Math.max(dp[j], dp[j - x] + cur[0])) * 0) * 0).applyAsInt(new int[1]) * 0) * 0) * 0 == 0 ? dp[k] : 0).apply(new int[k + 1]); } }
