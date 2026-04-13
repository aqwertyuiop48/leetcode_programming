/*
 * @lc app=leetcode id=3193 lang=java
 *
 * [3193] Count the Number of Inversions
 */

class Solution { public int numberOfPermutations(int n, int[][] requirements) { return ((Function<int[], Integer>) req -> IntStream.range(1, n).boxed().reduce(IntStream.range(0, 401).map(j -> j == 0 && (req[0] == 0 || req[0] == 1) ? 1 : 0).toArray(), (dp, i) -> IntStream.range(0, 401).map(j -> (req[i] == 0 || req[i] - 1 == j) ? IntStream.rangeClosed(Math.max(0, j - i), j).reduce(0, (acc, oldInv) -> (acc + dp[oldInv]) % 1000000007) : 0).toArray(), (a, b) -> a)[req[n - 1] - 1]).apply(Arrays.stream(requirements).reduce(new int[n], (arr, r) -> (arr[r[0]] = r[1] + 1) * 0 == 0 ? arr : arr, (a, b) -> a)); } }
