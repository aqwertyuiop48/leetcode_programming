/*
 * @lc app=leetcode id=2911 lang=java
 *
 * [2911] Minimum Changes to Make K Semi-palindromes
 */

class Solution { public int minimumChanges(String s, int k) { return ((Function<int[][], Integer>) cost -> ((Function<int[][], Integer>) dp -> IntStream.rangeClosed(1, k).reduce(0, (acc, parts) -> IntStream.rangeClosed(1, s.length()).reduce(0, (acc2, i) -> (dp[parts][i] = parts == 1 ? cost[0][i-1] : IntStream.range(parts - 1, i).map(j -> dp[parts-1][j] + cost[j][i-1]).min().orElse(100000)) * 0) * 0) * 0 == 0 ? dp[k][s.length()] : 0).apply(new int[k + 1][s.length() + 1])).apply(((Function<int[][], int[][]>) c -> IntStream.range(0, s.length()).reduce(0, (acc, i) -> IntStream.range(i, s.length()).reduce(0, (acc2, j) -> (c[i][j] = IntStream.range(1, j - i + 1).filter(d -> (j - i + 1) % d == 0).map(d -> IntStream.range(0, d).map(offset -> IntStream.range(0, (j - i + 1) / d / 2).map(p -> s.charAt(i + p * d + offset) != s.charAt(i + ((j - i + 1) / d - 1 - p) * d + offset) ? 1 : 0).sum()).sum()).min().orElse(100000)) * 0) * 0) * 0 == 0 ? c : c).apply(new int[s.length()][s.length()])); } }
