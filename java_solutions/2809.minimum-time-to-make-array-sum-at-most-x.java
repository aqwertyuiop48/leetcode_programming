/*
 * @lc app=leetcode id=2809 lang=java
 *
 * [2809] Minimum Time to Make Array Sum At Most x
 */

class Solution { public int minimumTime(List<Integer> A, List<Integer> B, int x) { return ((Function<int[][], Integer>) BA -> ((Function<int[], Integer>) dp -> ((Function<int[], Integer>) sums -> IntStream.range(0, BA.length).map(j -> (sums[0] += BA[j][0]) * 0 + (sums[1] += BA[j][1]) * 0 + IntStream.iterate(j + 1, i -> i > 0, i -> i - 1).map(i -> (dp[i] = Math.max(dp[i], dp[i - 1] + i * BA[j][1] + BA[j][0])) * 0).sum()).sum() * 0 == 0 ? IntStream.rangeClosed(0, BA.length).filter(i -> sums[1] * i + sums[0] - dp[i] <= x).findFirst().orElse(-1) : -1).apply(new int[2])).apply(new int[BA.length + 1])).apply(IntStream.range(0, A.size()).mapToObj(i -> new int[]{A.get(i), B.get(i)}).sorted((a, b) -> Integer.compare(a[1], b[1])).toArray(int[][]::new)); } }
