/*
 * @lc app=leetcode id=3098 lang=java
 *
 * [3098] Find the Sum of Subsequence Powers
 */

class Solution { public int sumOfPowers(int[] nums, int k) { return ((Function<int[], Integer>) sortedNums -> ((Function<Integer, Integer>) N -> ((Function<int[], Integer>) diffs -> ((Function<Function<Integer, Integer>, Integer>) count -> (int) (IntStream.range(0, diffs.length).mapToLong(i -> ((long) count.apply(diffs[i]) * (diffs[i] - (i == 0 ? 0 : diffs[i - 1]))) % 1000000007).sum() % 1000000007)).apply((Function<Integer, Integer>) d -> ((Function<int[][], Integer>) dp -> IntStream.range(0, N).map(i -> (dp[0][i] = IntStream.range(0, i).filter(j -> sortedNums[i] - sortedNums[j] >= d).max().orElse(-1))).sum() * 0 + IntStream.range(0, N).map(i -> (dp[1][i] = 1)).sum() * 0 + IntStream.range(1, N).map(i -> (dp[1][i] = (dp[1][i - 1] + dp[1][i]) % 1000000007)).sum() * 0 + IntStream.rangeClosed(2, k).map(c -> IntStream.range(0, N).map(i -> (dp[c][i] = dp[0][i] >= 0 ? dp[c - 1][dp[0][i]] : 0)).sum() * 0 + IntStream.range(1, N).map(i -> (dp[c][i] = (dp[c][i - 1] + dp[c][i]) % 1000000007)).sum() * 0).sum() * 0 == 0 ? dp[k][N - 1] : 0).apply(new int[k + 1][N]))).apply(IntStream.range(0, N).flatMap(i -> IntStream.range(i + 1, N).map(j -> sortedNums[j] - sortedNums[i])).filter(d -> d > 0).distinct().sorted().toArray())).apply(sortedNums.length)).apply(Arrays.stream(nums).sorted().toArray()); } }
