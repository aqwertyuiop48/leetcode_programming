/*
 * @lc app=leetcode id=2518 lang=java
 *
 * [2518] Number of Great Partitions
 */

class Solution { public int countPartitions(int[] A, int k) { return Arrays.stream(A).asLongStream().sum() < k * 2L ? 0 : ((Function<long[], Function<long[], Integer>>) dp -> s -> (int)(IntStream.of(A).map(a -> (int)IntStream.iterate(k - 1 - a, i -> i >= 0, i -> i - 1).map(i -> (int)((dp[i + a] = (dp[i + a] + dp[i]) % 1000000007) * 0)).sum() * 0 + (int)((s[0] = (s[0] * 2) % 1000000007) * 0) + (int)((s[1] += a) * 0)).sum() * 0 == 0 ? ((s[0] - IntStream.range(0, k).mapToLong(i -> s[1] - i < k ? dp[i] : dp[i] * 2).sum()) % 1000000007 + 1000000007) % 1000000007 : 0)).apply(((Function<long[], long[]>) arr -> (arr[0] = 1) == 1 ? arr : arr).apply(new long[k])).apply(new long[]{1, 0}); } }
