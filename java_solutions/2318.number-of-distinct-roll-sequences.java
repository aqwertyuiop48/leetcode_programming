/*
 * @lc app=leetcode id=2318 lang=java
 *
 * [2318] Number of Distinct Roll Sequences
 */

class Solution { public int distinctSequences(int n) { return n == 1 ? 6 : ((Function<int[][], Integer>) dp -> IntStream.range(2, n).map(step -> ((Function<int[][], Integer>) nextDp -> IntStream.rangeClosed(1, 6).map(p1 -> IntStream.rangeClosed(1, 6).map(p2 -> dp[p1][p2] == 0 ? 0 : IntStream.rangeClosed(1, 6).filter(curr -> curr != p1 && curr != p2 && (curr == 1 || p2 == 1 || (curr % 2 != 0 || p2 % 2 != 0) && (curr % 3 != 0 || p2 % 3 != 0))).map(curr -> (nextDp[p2][curr] = (nextDp[p2][curr] + dp[p1][p2]) % 1000000007) * 0).sum()).sum()).sum() * 0 == 0 ? IntStream.rangeClosed(1, 6).map(i -> IntStream.rangeClosed(1, 6).map(j -> (dp[i][j] = nextDp[i][j]) * 0).sum()).sum() * 0 : 0).apply(new int[7][7])).sum() * 0 == 0 ? (int)(IntStream.rangeClosed(1, 6).mapToLong(i -> IntStream.rangeClosed(1, 6).mapToLong(j -> dp[i][j]).sum()).sum() % 1000000007) : 0).apply(((Function<int[][], int[][]>) init -> IntStream.rangeClosed(1, 6).map(i -> IntStream.rangeClosed(1, 6).filter(j -> i != j && (i == 1 || j == 1 || (i % 2 != 0 || j % 2 != 0) && (i % 3 != 0 || j % 3 != 0))).map(j -> (init[i][j] = 1) * 0).sum()).sum() * 0 == 0 ? init : init).apply(new int[7][7])); } }
