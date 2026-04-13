/*
 * @lc app=leetcode id=3426 lang=java
 *
 * [3426] Manhattan Distances of All Arrangements of Pieces
 */

import java.math.BigInteger;
class Solution { public int distanceSum(int m, int n, int k) { return (int)(((LongStream.range(1, n).reduce(0L, (acc, d) -> (acc + 1L * d * (n - d) % 1000000007L * m % 1000000007L * m % 1000000007L) % 1000000007L) + LongStream.range(1, m).reduce(0L, (acc, d) -> (acc + 1L * d * (m - d) % 1000000007L * n % 1000000007L * n % 1000000007L) % 1000000007L)) % 1000000007L) * ((k - 2 > (long)m * n - 2) ? 0L : (LongStream.range(0, k - 2).reduce(1L, (acc, i) -> (acc * ((long)m * n - 2 - i)) % 1000000007L) * BigInteger.valueOf(LongStream.range(0, k - 2).reduce(1L, (acc, i) -> (acc * (i + 1)) % 1000000007L)).modInverse(BigInteger.valueOf(1000000007L)).longValue()) % 1000000007L) % 1000000007L); } }
