/*
 * @lc app=leetcode id=2338 lang=java
 *
 * [2338] Count the Number of Ideal Arrays
 */

class Solution { public int idealArrays(int n, int maxi) { return ((Function<Integer, Integer>) m -> ((Function<Object[], Integer>) box -> ((Function<BiFunction<Long, Long, Long>, Function<long[], Function<int[][], Integer>>>) power -> C -> dp -> (C[1] = 1) * 0 + IntStream.rangeClosed(2, m).mapToLong(j -> C[j] = C[j - 1] * (n - j + 1) % 1000000007L * power.apply((long)(j - 1), 1000000005L) % 1000000007L).sum() * 0 == 0 && IntStream.rangeClosed(1, maxi).map(i -> (dp[i][1] = 1) * 0 + IntStream.rangeClosed(2, maxi / i).map(j -> IntStream.range(1, m).map(k -> (dp[i * j][k + 1] = (dp[i * j][k + 1] + dp[i][k]) % 1000000007) * 0).sum()).sum()).sum() * 0 == 0 ? (int)(IntStream.rangeClosed(1, maxi).mapToLong(i -> IntStream.rangeClosed(1, m).mapToLong(j -> C[j] * dp[i][j] % 1000000007L).sum()).sum() % 1000000007L) : 0).apply((BiFunction<Long, Long, Long>) (box[0] = (BiFunction<Long, Long, Long>) (a, b) -> b == 0 ? 1L : (b % 2 == 1 ? (a * ((BiFunction<Long, Long, Long>)box[0]).apply((a * a) % 1000000007L, b / 2)) % 1000000007L : ((BiFunction<Long, Long, Long>)box[0]).apply((a * a) % 1000000007L, b / 2)))).apply(new long[16]).apply(new int[maxi + 1][16])).apply(new Object[1])).apply(Math.min(n, 14)); } }
