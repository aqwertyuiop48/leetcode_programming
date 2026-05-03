/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

class Solution {
    public int uniquePaths(int m, int n) {
        return java.util.stream.IntStream.rangeClosed(1, m - 1).mapToObj(i -> new java.math.BigInteger(String.valueOf(m + n - 2 - i + 1))).reduce(java.math.BigInteger.ONE, java.math.BigInteger::multiply).divide(java.util.stream.IntStream.rangeClosed(1, m - 1).mapToObj(i -> new java.math.BigInteger(String.valueOf(i))).reduce(java.math.BigInteger.ONE, java.math.BigInteger::multiply)).intValue();
    }
}
