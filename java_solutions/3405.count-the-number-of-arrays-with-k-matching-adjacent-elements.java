/*
 * @lc app=leetcode id=3405 lang=java
 *
 * [3405] Count the Number of Arrays with K Matching Adjacent Elements
 */

import java.math.BigInteger;
class Solution { public int countGoodArrays(int n, int m, int k) { return (int) (LongStream.rangeClosed(1, k).reduce(1L, (acc, i) -> (acc * (n - i)) % 1000000007L) * BigInteger.valueOf(LongStream.rangeClosed(1, k).reduce(1L, (acc, i) -> (acc * i) % 1000000007L)).modInverse(BigInteger.valueOf(1000000007L)).longValue() % 1000000007L * m % 1000000007L * BigInteger.valueOf(m - 1).modPow(BigInteger.valueOf(n - k - 1), BigInteger.valueOf(1000000007L)).longValue() % 1000000007L); } }
