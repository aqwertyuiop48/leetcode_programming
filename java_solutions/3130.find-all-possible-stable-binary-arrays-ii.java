/*
 * @lc app=leetcode id=3130 lang=java
 *
 * [3130] Find All Possible Stable Binary Arrays II
 */

class Solution { public int numberOfStableArrays(int zero, int one, int limit) { return ((Function<long[][][], Integer>) dp -> IntStream.rangeClosed(1, Math.min(zero, limit)).map(i -> (int)(dp[i][0][0] = 1)).sum() * 0 + IntStream.rangeClosed(1, Math.min(one, limit)).map(j -> (int)(dp[0][j][1] = 1)).sum() * 0 + IntStream.rangeClosed(1, zero).map(i -> IntStream.rangeClosed(1, one).map(j -> (int)((dp[i][j][0] = (dp[i-1][j][0] + dp[i-1][j][1] - (i - limit >= 1 ? dp[i-limit-1][j][1] : 0) + 1000000007) % 1000000007) * 0 + (dp[i][j][1] = (dp[i][j-1][0] + dp[i][j-1][1] - (j - limit >= 1 ? dp[i][j-limit-1][0] : 0) + 1000000007) % 1000000007) * 0)).sum()).sum() * 0 == 0 ? (int)((dp[zero][one][0] + dp[zero][one][1]) % 1000000007) : 0).apply(new long[zero + 1][one + 1][2]); } }
